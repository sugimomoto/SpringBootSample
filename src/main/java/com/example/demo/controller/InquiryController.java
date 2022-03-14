package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Inquiry;

@Controller
public class InquiryController {
    
    @GetMapping("/")
    public String index(@ModelAttribute Inquiry inquiry){
        return "inquiry";
    }

    @PostMapping("/")
    public String confirm(@Validated @ModelAttribute Inquiry inquiry, BindingResult result){

        if(result.hasErrors()){
            return "inquiry";
        }        

        return "confirm";
    }
}
