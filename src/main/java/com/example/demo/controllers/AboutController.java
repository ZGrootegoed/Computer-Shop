package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String aboutScreen(Model model) {
        return "about";
    }

    @RequestMapping(value="/Mredirect")
    public String redirectM() {
        return "redirect:/mainscreen";
    }
    @RequestMapping(value="/Aredirect")
    public String redirectA() {
        return "redirect:/about";
    }
}
