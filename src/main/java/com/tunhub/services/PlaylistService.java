package com.tunhub.services;

import java.util.List;

import com.tunhub.entities.Playlist;

public interface PlaylistService {
	   void addPlaylist(Playlist playlist);

	   List<Playlist> fetchAllPlaylists();
}
