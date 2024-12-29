package com.whitewolfs.rakesh.project.uber.repositories;

import com.whitewolfs.rakesh.project.uber.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
