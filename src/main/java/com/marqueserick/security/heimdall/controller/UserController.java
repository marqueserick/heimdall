package com.marqueserick.security.heimdall.controller;

import com.marqueserick.security.heimdall.controller.dto.UserDto;
import com.marqueserick.security.heimdall.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping("new")
    public ResponseEntity<UserDto> createNewUser(@RequestBody UserDto user){
        return ResponseEntity.ok(service.createNewUser(user));
    }
}
