package com.whitewolfs.rakesh.project.uber.repositories;

import com.whitewolfs.rakesh.project.uber.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}
