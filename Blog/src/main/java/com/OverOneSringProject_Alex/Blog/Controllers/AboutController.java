package com.OverOneSringProject_Alex.Blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String greeting(Model model) {
        model.addAttribute("title", "This project was prepared with the help of spring boot and bootstrap by Alexander Cherniavski");
        return "about_page";
    }
}
