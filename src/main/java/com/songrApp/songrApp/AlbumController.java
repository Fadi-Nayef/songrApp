package com.songrApp.songrApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    private AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String albumList(Model m ) {
        m.addAttribute("albums", albumRepository.findAll());
        return "album";
    }

    @GetMapping("/addalbum")
    public String getAlbum(Model m){

        return "newAlbum";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(@RequestParam String title, @RequestParam String artist,@RequestParam int songCount,@RequestParam int length,@RequestParam String imageUrl ){
        Album newAlbum = new Album(title,artist,songCount,length,imageUrl);

        albumRepository.save(newAlbum);

        return new RedirectView("/albums");
    }


}
