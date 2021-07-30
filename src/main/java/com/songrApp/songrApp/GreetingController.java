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


    @GetMapping("/albums")
    public String getAlbum(Model model){
        ArrayList<Album> album = new ArrayList<>();

        var album1= new Album("title1","artist1",2,5,"url1");
        var album2= new Album("title2","artist2",2,5,"url2");
        var album3= new Album("title3","artist3",2,5,"url3");

        album.add(album1);
        album.add(album2);
        album.add(album3);

        model.addAttribute("album",album);

        return "album";
    }
}
