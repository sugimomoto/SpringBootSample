package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Invoice;

@Controller
public class InvoiceController {
    
    @GetMapping(value="/invoice")
    public String getInvoice(@ModelAttribute Invoice invoice) {
        return "invoiceform";
    }
    
    @PostMapping(value="/invoice")
    public String postInvoice(@Validated @ModelAttribute Invoice invoice, BindingResult result){

        if(result.hasErrors()){
            return "invoiceform";
        }

        return "invoiceconfirm";
    }
}
