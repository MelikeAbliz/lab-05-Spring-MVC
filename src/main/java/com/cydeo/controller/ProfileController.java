package com.cydeo.controller;

import com.cydeo.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class ProfileController {

    @GetMapping("/profile")
    public String getProfilePage(Model model){
        Profile profile1 = new Profile();
        profile1.setName("Severus");
        profile1.setSurname("Snape");
        profile1.setUserName("severus_snape");
        profile1.setEmail("severus@hogwarts.com");
        profile1.setPhoneNumber("02027658832");
        profile1.setCreatedDate(LocalDateTime.now());
        model.addAttribute("profile",profile1);
        return "profile/profile-info";
    }
}
