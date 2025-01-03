package com.whitewolfs.rakesh.project.uber.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverDTO {

    private UserDTO user;
    private Double rating;
}
