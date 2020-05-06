package com.music.spotify.controller;

import com.music.spotify.model.Song;
import com.music.spotify.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/")
    public List<Song> list(){
        return songService.list();
    }
    @GetMapping("/{id}")
    public Song findById(@PathVariable Integer id){
        return songService.findById(id);
    }
    @PostMapping("/")
    public Song create(@RequestBody Song song){
        return songService.create(song);
    }
    @PutMapping("/")
    public  Song update (@RequestBody Song song){
        return songService.update(song);
    }
    @DeleteMapping("/{id}")
    public  void delete(@PathVariable (value = "id") Integer id){
        songService.delete(id);
    }
    @GetMapping("/artist/{id}")
    public List<Song> findSongsByArtistId(@PathVariable Integer id){
        return songService.findSongsByArtistId(id);
    }
}
