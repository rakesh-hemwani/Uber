package com.whitewolfs.rakesh.project.uber.repositories;

import com.whitewolfs.rakesh.project.uber.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
