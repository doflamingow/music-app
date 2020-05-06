package com.music.spotify.service;

import com.music.spotify.model.Genre;

import java.util.List;

public interface GenreService {
    List<Genre> list();
    Genre findById(Integer id);
    Genre create(Genre genre);
    Genre update(Genre genre);
    void delete(Integer id);
}
