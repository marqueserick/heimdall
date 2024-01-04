package com.marqueserick.security.heimdall.model.factory;


import com.marqueserick.security.heimdall.controller.dto.UserDto;
import com.marqueserick.security.heimdall.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

    public User toUser(UserDto userDto){
        return User.builder()
                .email(userDto.getEmail())
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .build();
    }

    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .username(user.getUsername())
                .build();
    }
}
