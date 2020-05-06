package com.music.spotify.service;

import com.music.spotify.model.Artist;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ArtistService {
    List<Artist> list();
    Artist findById(Integer id);
    Artist create(MultipartFile image, String artist) throws IOException;
    void delete(Integer id);
    Artist update(Artist artist);
    List<Artist> findArtistByGenreId(Integer id);
}
