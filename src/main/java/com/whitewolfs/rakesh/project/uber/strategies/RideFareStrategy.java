package com.whitewolfs.rakesh.project.uber.strategies;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.entities.RideRequest;

public interface RideFareStrategy {

    Double RIDE_FARE_MULTIPLIER = 10.0;
    Double calculateFare(RideRequest rideRequest);
}
