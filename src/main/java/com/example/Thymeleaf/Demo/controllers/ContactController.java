package com.example.Thymeleaf.Demo.controllers;

import com.example.Thymeleaf.Demo.Model.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showContactForm(Model model) {

        model.addAttribute("contact", new Contact());

        return "contact";
    }

@PostMapping("/contact")
public String submitContact(Contact contact, Model model) {

    model.addAttribute("submittedContact", contact);

    return "contact-result";
}





    
}
