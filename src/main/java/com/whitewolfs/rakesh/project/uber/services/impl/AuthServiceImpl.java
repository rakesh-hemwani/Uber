package com.whitewolfs.rakesh.project.uber.services.impl;

import com.whitewolfs.rakesh.project.uber.dto.DriverDTO;
import com.whitewolfs.rakesh.project.uber.dto.SignupDTO;
import com.whitewolfs.rakesh.project.uber.dto.UserDTO;
import com.whitewolfs.rakesh.project.uber.entities.User;
import com.whitewolfs.rakesh.project.uber.entities.enums.Role;
import com.whitewolfs.rakesh.project.uber.exceptions.RuntimeConflictException;
import com.whitewolfs.rakesh.project.uber.repositories.UserRepository;
import com.whitewolfs.rakesh.project.uber.services.AuthService;
import com.whitewolfs.rakesh.project.uber.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    @Transactional
    public UserDTO signup(SignupDTO signupDTO) {
         User user =userRepository.findByEmail(signupDTO.getEmail()).orElse(null);

         if(user != null){
             throw new RuntimeConflictException("User with this email already exits! :" + signupDTO.getEmail());
         }


        User toSave = modelMapper.map(signupDTO,User.class);
        toSave.setRoles(Set.of(Role.RIDER));
        User registerdUser = userRepository.save(toSave);

        riderService.createNewRider(registerdUser);

        return modelMapper.map(registerdUser, UserDTO.class);
    }

    @Override
    public DriverDTO obBoardNewDriver(Long userid) {
        return null;
    }
}
