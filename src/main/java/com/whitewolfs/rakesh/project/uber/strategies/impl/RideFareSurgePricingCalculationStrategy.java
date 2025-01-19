package com.whitewolfs.rakesh.project.uber.strategies.impl;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.entities.RideRequest;
import com.whitewolfs.rakesh.project.uber.services.DistanceService;
import com.whitewolfs.rakesh.project.uber.strategies.RideFareStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareSurgePricingCalculationStrategy implements RideFareStrategy {
    private final DistanceService distanceService;

    @Override
    public Double calculateFare(RideRequest rideRequest) {
        Double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(), rideRequest.getDropOffLocation());
        return distance * RIDE_FARE_MULTIPLIER * SURGE_FACTOR;
    }
}
