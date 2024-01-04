package com.marqueserick.security.heimdall.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private Long id;
    private String username;
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
}
