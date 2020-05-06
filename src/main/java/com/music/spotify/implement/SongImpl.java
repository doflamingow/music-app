package com.music.spotify.implement;

import com.music.spotify.model.Song;
import com.music.spotify.repository.SongRepo;
import com.music.spotify.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongImpl implements SongService {
    @Autowired
    SongRepo songRepo;

    @Override
    public List<Song> list() {
        return songRepo.findAll();
    }

    @Override
    public Song findById(Integer id) {
        return songRepo.findById(id).get();
    }

    @Override
    public Song create(Song song) {
        return songRepo.save(song);
    }

    @Override
    public Song update(Song song) {
        return songRepo.save(song);
    }

    @Override
    public void delete(Integer id) {
        songRepo.deleteById(id);
    }

    @Override
    public List<Song> findSongsByArtistId(Integer id) {
        return songRepo.findSongsByArtistId(id);
    }
}
