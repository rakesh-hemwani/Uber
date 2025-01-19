package com.whitewolfs.rakesh.project.uber.strategies;

import com.whitewolfs.rakesh.project.uber.strategies.impl.DriverMatchingHighestRatedDriverStrategy;
import com.whitewolfs.rakesh.project.uber.strategies.impl.DriverMatchingNearestDriverStrategy;
import com.whitewolfs.rakesh.project.uber.strategies.impl.RideFareDefaultFareCalculationStrategy;
import com.whitewolfs.rakesh.project.uber.strategies.impl.RideFareSurgePricingCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class RideStrategyManager {

    private final DriverMatchingHighestRatedDriverStrategy matchingHighestRatedDriverStrategy;
    private final DriverMatchingNearestDriverStrategy matchingNearestDriverStrategy;
    private final RideFareDefaultFareCalculationStrategy defaultFareCalculationStrategy;
    private final RideFareSurgePricingCalculationStrategy surgePricingCalculationStrategy;

    public DriverMatchingStartegy driverMatchingStartegy(double rideRating) {
        if (rideRating >= 4.8)
            return matchingHighestRatedDriverStrategy;
        else
            return matchingNearestDriverStrategy;
    }

    public RideFareStrategy rideFareStrategy() {
        LocalTime surgeStartTime = LocalTime.of(18, 0);
        LocalTime surgeEndTime = LocalTime.of(21, 0);
        LocalTime curTime = LocalTime.now();
        boolean isSurgeTime = curTime.isAfter(surgeStartTime) && curTime.isBefore(surgeEndTime);
        if (isSurgeTime)
            return surgePricingCalculationStrategy;
        else
            return defaultFareCalculationStrategy;
    }
}
