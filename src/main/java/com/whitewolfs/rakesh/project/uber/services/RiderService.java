package com.whitewolfs.rakesh.project.uber.services;

import com.whitewolfs.rakesh.project.uber.dto.DriverDTO;
import com.whitewolfs.rakesh.project.uber.dto.RideDTO;
import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.dto.RiderDTO;
import com.whitewolfs.rakesh.project.uber.entities.Rider;
import com.whitewolfs.rakesh.project.uber.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RiderService {
    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);

    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);

    RiderDTO getMyProfile();

    List<RideDTO> getAllMyRides();

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
