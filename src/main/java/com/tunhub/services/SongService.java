package com.tunhub.services;

import java.util.List;

import com.tunhub.entities.Song;

public interface SongService {
	   void addSong(Song song);

	   List<Song> fetchAllSongs();

	   boolean songExists(String name);

	   void updateSong(Song song);
}