package com.whitewolfs.rakesh.project.uber.services;

import com.whitewolfs.rakesh.project.uber.dto.DriverDTO;
import com.whitewolfs.rakesh.project.uber.dto.RideDTO;
import com.whitewolfs.rakesh.project.uber.dto.RiderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DriverService {
    RideDTO cancelRide(Long rideId);
    RideDTO startRide(Long rideId);
    RideDTO endRide(Long rideId);
    RiderDTO rateRider(Long rideId, Integer rating);
    RideDTO acceptRide(Long rideId);

    DriverDTO getMyProfile();
    List<RideDTO> getAllMyRides();
}
