package com.whitewolfs.rakesh.project.uber.services.impl;

import com.whitewolfs.rakesh.project.uber.services.DistanceService;
import lombok.Data;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {

    private static final String OSRM_API_BASE_URL = "http://router.project-osrm.org/route/v1/driving/";

    @Override
    public double calculateDistance(Point src, Point dst) {
        try {
            String uri = src.getX() + "," + src.getY() + ";" + dst.getX() + "," + dst.getY() + ";";

            OSRMReponseDTO osrmReponseDTO = RestClient.builder()
                    .baseUrl(OSRM_API_BASE_URL)
                    .build()
                    .get()
                    .uri(uri)
                    .retrieve()
                    .body(OSRMReponseDTO.class);

            return osrmReponseDTO.getRoutes().get(0).getDistance() / 1000.0;
        } catch (Exception exception) {
            throw new RuntimeException("Error getting Data from OSRM " + exception.getMessage());
        }

    }
}

@Data
class OSRMReponseDTO {
    private List<OSRMRoute> routes;
}

@Data
class OSRMRoute {
    private Double distance;
}