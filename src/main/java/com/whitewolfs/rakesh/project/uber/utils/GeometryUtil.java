package com.whitewolfs.rakesh.project.uber.utils;

import com.whitewolfs.rakesh.project.uber.dto.PointDto;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.PrecisionModel;


public class GeometryUtil {
    public static Point createPoint(PointDto pointDto){
        GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
        // SRID 4326 Points to earth globe GPS
        Coordinate coordinate = new Coordinate(pointDto.getCoordinates()[0],
                pointDto.getCoordinates()[1]);

        return geometryFactory.createPoint(coordinate);
    }
}
