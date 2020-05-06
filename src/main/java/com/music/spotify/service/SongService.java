package com.music.spotify.service;

import com.music.spotify.model.Song;

import java.util.List;

public interface SongService {
    List<Song> list();
    Song findById(Integer id);
    Song create(Song song);
    Song update(Song song);
    void delete(Integer id);
    List<Song> findSongsByArtistId(Integer id);
}
