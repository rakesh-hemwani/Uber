package com.whitewolfs.rakesh.project.uber.strategies;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.entities.Driver;
import com.whitewolfs.rakesh.project.uber.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStartegy {
    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
