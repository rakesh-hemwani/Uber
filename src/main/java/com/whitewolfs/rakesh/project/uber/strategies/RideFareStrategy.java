package com.whitewolfs.rakesh.project.uber.strategies;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;

public interface RideFareStrategy {
    Double calculateFare(RideRequestDTO rideRequestDTO);
}
