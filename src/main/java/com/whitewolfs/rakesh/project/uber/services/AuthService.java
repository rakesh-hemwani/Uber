package com.whitewolfs.rakesh.project.uber.services;

import com.whitewolfs.rakesh.project.uber.dto.DriverDTO;
import com.whitewolfs.rakesh.project.uber.dto.SignupDTO;
import com.whitewolfs.rakesh.project.uber.dto.UserDTO;
import org.springframework.stereotype.Service;

public interface AuthService {
    String login(String email, String password);

    UserDTO signup(SignupDTO signupDTO);

    DriverDTO obBoardNewDriver(Long userid);
}
