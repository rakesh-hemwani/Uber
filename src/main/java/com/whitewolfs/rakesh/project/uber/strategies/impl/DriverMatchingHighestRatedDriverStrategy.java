package com.whitewolfs.rakesh.project.uber.strategies.impl;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.entities.Driver;
import com.whitewolfs.rakesh.project.uber.entities.RideRequest;
import com.whitewolfs.rakesh.project.uber.repositories.DriverRepository;
import com.whitewolfs.rakesh.project.uber.strategies.DriverMatchingStartegy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStartegy {
    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
