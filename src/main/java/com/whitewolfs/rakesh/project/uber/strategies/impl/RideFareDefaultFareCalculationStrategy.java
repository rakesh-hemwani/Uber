package com.whitewolfs.rakesh.project.uber.strategies.impl;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.strategies.RideFareStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareStrategy {
    @Override
    public Double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0.0;
    }
}
