package com.caffeine.coffee.controller;

import com.caffeine.coffee.parser.HtmlParser;
import com.caffeine.coffee.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    private CoffeeService mService;

    @Autowired
    public HomeController(CoffeeService mService) {
        this.mService = mService;
    }

    @GetMapping("/coffee")
    public String returnTest(Model model) {
        model.addAttribute("coffee",mService.getAllCoffee());
        return "test";
    }

    @GetMapping
    public String getHome() {
        HtmlParser.getHtml();
        return "index";}
}
