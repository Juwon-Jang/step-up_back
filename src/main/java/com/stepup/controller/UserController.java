package com.stepup.controller;

import com.stepup.model.User;
import com.stepup.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User loginRequest) {
        return userService.login(loginRequest.getUsername(), loginRequest.getPassword());
    }

    @GetMapping("/mentors")
    public List<User> getMentors() {
        return userService.getMentorList();
    }
}
