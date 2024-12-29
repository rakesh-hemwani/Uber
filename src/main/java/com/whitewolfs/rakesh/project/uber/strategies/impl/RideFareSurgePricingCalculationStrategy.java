package com.whitewolfs.rakesh.project.uber.strategies.impl;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.strategies.RideFareStrategy;

public class RideFareSurgePricingCalculationStrategy implements RideFareStrategy {
    @Override
    public Double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0.0;
    }
}
