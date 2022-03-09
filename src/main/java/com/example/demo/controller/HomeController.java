package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/modelform")
    public String readForm(@ModelAttribute User user){
        return "modelform";
    }

    @PostMapping("/modelform")
    public String confirm(@ModelAttribute User user){
        return "modelformconfirm";
    }
}
