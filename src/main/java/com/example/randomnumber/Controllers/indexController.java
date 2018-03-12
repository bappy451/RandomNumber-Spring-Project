package com.example.randomnumber.Controllers;

import com.example.randomnumber.Services.Numbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    public Numbers numbers;

    @Autowired
    public indexController(Numbers numbers) {
        this.numbers = numbers;
    }

    @RequestMapping({"/","","new"})
    public String getNumber(Model model){
        model.addAttribute("num",numbers.getNumber());
        return "index";
    }
}
