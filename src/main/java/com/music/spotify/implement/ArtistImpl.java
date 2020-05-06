package com.music.spotify.implement;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.music.spotify.model.Artist;
import com.music.spotify.repository.ArtistRepo;
import com.music.spotify.service.ArtistService;
import com.music.spotify.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
public class ArtistImpl implements ArtistService {

    @Autowired
    ArtistRepo artistRepo;
    @Autowired
    FileService fileService;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public List<Artist> list() {
        return artistRepo.findAll();
    }

    @Override
    public Artist findById(Integer id) {
        return artistRepo.findById(id).get();
    }

    @Override
    public Artist create(MultipartFile image, String artist) throws IOException {
        Artist newArtist = objectMapper.readValue(artist, Artist.class);
        fileService.saveFilePicture(image, newArtist.getId().toString());
        return artistRepo.save(newArtist);
    }

    @Override
    public void delete(Integer id) {
        artistRepo.deleteById(id);
    }

    @Override
    public Artist update(Artist artist) {
        return artistRepo.save(artist);
    }

    @Override
    public List<Artist> findArtistByGenreId(Integer id) {
        return artistRepo.findArtistByGenreId(id);
    }
}
