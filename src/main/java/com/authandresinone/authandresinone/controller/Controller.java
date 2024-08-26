package com.authandresinone.authandresinone.controller;

import com.authandresinone.authandresinone.Dto.UserDto;
import com.authandresinone.authandresinone.entities.UserEntity;
import com.authandresinone.authandresinone.repo.UserRepository;
//import com.authandresinone.authandresinone.services.CustomUserDetails;
import com.authandresinone.authandresinone.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class Controller {


    private final UserService userService;

    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserDto userDto) throws Exception {
            String response = userService.signup(userDto);
            return new ResponseEntity<>(response, HttpStatus.CREATED);

    }


}
