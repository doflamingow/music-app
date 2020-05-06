package com.music.spotify.controller;

import com.music.spotify.model.Genre;
import com.music.spotify.repository.ArtistRepo;
import com.music.spotify.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    GenreService genreService;

    @GetMapping("/")
    public List<Genre> list(){
        return genreService.list();
    }
    @GetMapping("/{id}")
    public Genre findById(@PathVariable Integer id){
        return genreService.findById(id);
    }
    @PostMapping("/")
    public Genre create(@RequestBody Genre genre){
        return genreService.create(genre);
    }
    @PutMapping("/")
    public Genre update(@RequestBody Genre genre){
        return genreService.update(genre);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable (value = "id") Integer id){
        genreService.delete(id);
    }
}
