package com.example.SpringSecurityFileStorage.Mapper;

import com.example.SpringSecurityFileStorage.DTO.UserDTO;
import com.example.SpringSecurityFileStorage.Entity.User;

public class UserMapper {
    public static UserDTO mapToUserDTO(User user) {
        return new UserDTO(user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                user.getRole());
    }

    public static User mapToUser(UserDTO userDTO) {
        return new User(userDTO.getId(),
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getEmail(),
                userDTO.getPassword(),
                userDTO.getRole());
    }
}
