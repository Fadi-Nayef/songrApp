package com.songrApp.songrApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.persistence.Entity;
import java.util.List;

@Controller
public class SongController {
@Autowired
    private SongRepository songRepository;
@Autowired
private AlbumRepository albumRepository;

@GetMapping("/songs")
    public String songsList(Model m ){
    List<Song> songs = songRepository.findAll();
    m.addAttribute("songs",songs);

    return "songslist";

}
@PostMapping("/songs")
    public RedirectView  addSong(Long id,String title,int length,int trackNumber ){
    Song song = new Song();
    song.setTitle(title);
    song.setLength(length);
    song.setTrackNumber(trackNumber);
    Album album =  albumRepository.getById(id);
    song.setAlbum(album);

    songRepository.save(song);
    return new RedirectView ("/songs");
}

}
