package com.profITsoft.internship.controller;

import com.profITsoft.internship.dto.UserDto;
import com.profITsoft.internship.service.serviceInterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String getAllUsers(Model model){
        List<UserDto> allUsers = userService.findAllUserDTOs();
        model.addAttribute("allUsers", allUsers);
        return "allUsers";
    }

    @GetMapping
    public String welcomePage() {
        return "welcomePage";
    }

}
