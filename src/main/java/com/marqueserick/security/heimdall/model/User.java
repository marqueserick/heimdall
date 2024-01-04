package com.marqueserick.security.heimdall.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Table(name="credential")
@Entity
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
}
