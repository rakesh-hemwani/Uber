package com.whitewolfs.rakesh.project.uber.strategies.impl;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.entities.RideRequest;
import com.whitewolfs.rakesh.project.uber.strategies.RideFareStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingCalculationStrategy implements RideFareStrategy {
    @Override
    public Double calculateFare(RideRequest rideRequest) {
        return 0.0;
    }
}
