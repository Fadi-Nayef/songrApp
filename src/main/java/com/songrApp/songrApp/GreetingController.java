package com.songrApp.songrApp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Locale;

@Controller
public class GreetingController {
    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "name" , required = false,defaultValue = "Hello World")String name , Model model){
        return "comeback";

    }


    @GetMapping("/capitalize/{hello}")
    public String helloWorldCapitalize(@PathVariable String hello , Model m){
//        String capital = new String("Hello");
        m.addAttribute("capital",hello.toUpperCase(Locale.ROOT));
        return "capitalize";
    }



}
