package com.music.spotify.controller;

import com.music.spotify.model.Artist;
import com.music.spotify.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping("/")
    public List<Artist> list(){
        return artistService.list();
    }
    @GetMapping("/{id}")
    public Artist findById(@PathVariable Integer id){
        return artistService.findById(id);
    }
    @PostMapping("/")
    public Artist create(@RequestPart MultipartFile image, String artist) throws IOException {
        return artistService.create(image, artist);
    }
    @PutMapping("/")
    public Artist update(@RequestBody Artist artist){
        return artistService.update(artist);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable (value = "id") Integer id){
        artistService.delete(id);
    }
    @GetMapping("/genre/{id}")
    public List<Artist> findArtistByGenreId(@PathVariable Integer id){
        return artistService.findArtistByGenreId(id);
    }
}
