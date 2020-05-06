package com.music.spotify.implement;

import com.music.spotify.model.Genre;
import com.music.spotify.repository.GenreRepo;
import com.music.spotify.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenreImpl implements GenreService {
    @Autowired
    GenreRepo genreRepo;
    @Override
    public List<Genre> list() {
        return genreRepo.findAll();
    }

    @Override
    public Genre findById(Integer id) {
        return genreRepo.findById(id).get();
    }

    @Override
    public Genre create(Genre genre) {
        return genreRepo.save(genre);
    }

    @Override
    public Genre update(Genre genre) {
        return genreRepo.save(genre);
    }

    @Override
    public void delete(Integer id) {
        genreRepo.deleteById(id);
    }
}
