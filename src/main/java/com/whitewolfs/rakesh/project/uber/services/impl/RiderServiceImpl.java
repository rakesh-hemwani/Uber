package com.whitewolfs.rakesh.project.uber.services.impl;

import com.whitewolfs.rakesh.project.uber.dto.DriverDTO;
import com.whitewolfs.rakesh.project.uber.dto.RideDTO;
import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.dto.RiderDTO;
import com.whitewolfs.rakesh.project.uber.entities.RideRequest;
import com.whitewolfs.rakesh.project.uber.entities.Rider;
import com.whitewolfs.rakesh.project.uber.entities.User;
import com.whitewolfs.rakesh.project.uber.entities.enums.RideRequestStatus;
import com.whitewolfs.rakesh.project.uber.repositories.RideRequestRepository;
import com.whitewolfs.rakesh.project.uber.repositories.RiderRepository;
import com.whitewolfs.rakesh.project.uber.services.RiderService;
import com.whitewolfs.rakesh.project.uber.strategies.DriverMatchingStartegy;
import com.whitewolfs.rakesh.project.uber.strategies.RideFareStrategy;
import com.whitewolfs.rakesh.project.uber.strategies.impl.RideFareDefaultFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RiderServiceImpl  implements RiderService {

    private final ModelMapper modelMapper;
    private final RideFareStrategy rideFareStrategy;
    private final RideRequestRepository rideRequestRepository;
    private final DriverMatchingStartegy driverMatchingStartegy;
    private final RiderRepository riderRepository;

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        RideRequest rideRequest = modelMapper.map(rideRequestDTO,RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double rideFare = rideFareStrategy.calculateFare(rideRequest);
        rideRequest.setFare(rideFare);
        //log.info(rideRequest.toString());
        RideRequest savedRideRequest = rideRequestRepository.save(rideRequest);

        driverMatchingStartegy.findMatchingDriver(savedRideRequest);
        return modelMapper.map(savedRideRequest, RideRequestDTO.class);
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }

    @Override
    public Rider createNewRider(User user) {
        Rider rider = Rider
                .builder()
                .user(user)
                .rating(0.0)
                .build();
        return riderRepository.save(rider);
    };
}
