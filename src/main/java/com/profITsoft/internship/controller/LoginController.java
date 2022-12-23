package com.profITsoft.internship.controller;

import com.profITsoft.internship.entity.User;
import com.profITsoft.internship.service.serviceInterfaces.SecurityService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final SecurityService securityService;

    @Autowired
    public LoginController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping
    public String login(){
        return "login";
    }

    @PostMapping
    public String loginUser(Model model, @RequestParam ("login") String login, @RequestParam ("password") String password
            , HttpSession session){
        User selectedUser = securityService.findUser(login, password);
        if(selectedUser==null){
            model.addAttribute("loginError", "Incorrect login or password");
            return "login";
        }
        session.setAttribute("user", selectedUser);
        return "redirect:/user";
    }

}
