package com.whitewolfs.rakesh.project.uber.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double rating;

    @Column(name = "available")
    private Boolean isAvailable;

    private String vehicleId;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    Point currentLocation;
}
