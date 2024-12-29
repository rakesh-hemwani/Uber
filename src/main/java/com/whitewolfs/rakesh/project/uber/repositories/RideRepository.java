package com.whitewolfs.rakesh.project.uber.repositories;

import com.whitewolfs.rakesh.project.uber.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}
