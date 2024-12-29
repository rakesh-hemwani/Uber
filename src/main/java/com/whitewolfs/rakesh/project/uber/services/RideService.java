package com.whitewolfs.rakesh.project.uber.services;

import com.whitewolfs.rakesh.project.uber.dto.DriverDTO;
import com.whitewolfs.rakesh.project.uber.dto.RideRequestDTO;
import com.whitewolfs.rakesh.project.uber.entities.Driver;
import com.whitewolfs.rakesh.project.uber.entities.Ride;
import com.whitewolfs.rakesh.project.uber.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

public interface RideService {
    Ride getRideById(Long rideId);

    void matchWithDriver(RideRequestDTO rideRequestDTO);
    Ride createNewRide(RideRequestDTO rideRequestDTO, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);
    Page<Ride> getAllRideOfRider(Long riderID, PageRequest pageRequest);
    Page<Ride> getAllRideOfDriver(Long driverID, PageRequest pageRequest);
}
