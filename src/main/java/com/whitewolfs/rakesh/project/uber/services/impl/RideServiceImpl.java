package com.whitewolfs.rakesh.project.uber.services.impl;

import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.entities.Driver;
import com.whitewolfs.rakesh.project.uber.entities.Ride;
import com.whitewolfs.rakesh.project.uber.entities.enums.RideStatus;
import com.whitewolfs.rakesh.project.uber.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDriver(RideRequestDTO rideRequestDTO) {

    }

    @Override
    public Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRideOfRider(Long riderID, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRideOfDriver(Long driverID, PageRequest pageRequest) {
        return null;
    }
}
