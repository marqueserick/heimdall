package com.marqueserick.security.heimdall.service;

import com.marqueserick.security.heimdall.controller.dto.UserDto;
import com.marqueserick.security.heimdall.model.User;
import com.marqueserick.security.heimdall.model.factory.UserFactory;
import com.marqueserick.security.heimdall.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;
    private final UserFactory factory;

    public UserService(UserRepository repository, UserFactory factory){
        this.repository = repository;
        this.factory = factory;
    }

    public UserDto createNewUser(UserDto userDto) {
        User user = factory.toUser(userDto);
        repository.save(user);
        return factory.toDto(user);
    }
}
