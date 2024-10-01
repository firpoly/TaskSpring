package com.example.TaskSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PostController {
    private SystemProfile profile;

    public PostController(SystemProfile profile) {
        this.profile = profile;
   }

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}
