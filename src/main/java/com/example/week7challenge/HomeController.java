package com.example.week7challenge;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model){
        FruitStand f = new FruitStand();
        f.setFruit("Strawberries");
        f.setHours("10am to 4pm");
        f.setWeekday("Monday");

        model.addAttribute("fruitstand",f);

        return "index";
    }
}
