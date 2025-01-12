package com.whitewolfs.rakesh.project.uber.dto;

import com.whitewolfs.rakesh.project.uber.entities.Driver;
import com.whitewolfs.rakesh.project.uber.entities.Rider;
import com.whitewolfs.rakesh.project.uber.entities.enums.PaymentMethod;
import com.whitewolfs.rakesh.project.uber.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideDTO {

    private Long id;

    private Point pickupLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private RiderDTO rider;

    private DriverDTO driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private String otp;

    private Double fare;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
