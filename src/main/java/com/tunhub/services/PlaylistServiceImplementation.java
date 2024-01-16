package com.tunhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhub.entities.Playlist;
import com.tunhub.repository.PlaylistRepository;

@Service
public class PlaylistServiceImplementation implements PlaylistService {
   @Autowired
   PlaylistRepository repo;

   public PlaylistServiceImplementation() {
   }

   public void addPlaylist(Playlist playlist) {
      this.repo.save(playlist);
   }

   public List<Playlist> fetchAllPlaylists() {
      return this.repo.findAll();
   }
}