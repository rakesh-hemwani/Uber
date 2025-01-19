package com.whitewolfs.rakesh.project.uber.controller;

import com.whitewolfs.rakesh.project.uber.dto.SignupDTO;
import com.whitewolfs.rakesh.project.uber.dto.UserDTO;
import com.whitewolfs.rakesh.project.uber.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping(path = "/signUp")
    UserDTO signUp(@RequestBody SignupDTO signupDTO) {
        return authService.signup(signupDTO);
    }
}
