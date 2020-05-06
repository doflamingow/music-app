package com.music.spotify.repository;

import com.music.spotify.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepo extends JpaRepository<Song,Integer> {
    List<Song> findSongsByArtistId(Integer id);
}
