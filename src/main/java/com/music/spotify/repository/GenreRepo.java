package com.music.spotify.repository;

import com.music.spotify.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre,Integer> {
}
