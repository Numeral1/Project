package com.OverOneSringProject_Alex.Blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "my first page");
        return "home_page";
    }

}
