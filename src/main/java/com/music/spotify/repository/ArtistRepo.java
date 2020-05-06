package com.music.spotify.repository;

import com.music.spotify.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtistRepo extends JpaRepository<Artist,Integer> {
    List<Artist> findArtistByGenreId (Integer id);
}
