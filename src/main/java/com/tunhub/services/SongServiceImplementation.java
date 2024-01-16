package com.tunhub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunhub.entities.Song;
import com.tunhub.repository.SongRepository;


@Service
public class SongServiceImplementation implements SongService {
   @Autowired
   SongRepository repo;
   
   public SongServiceImplementation() {
   }

   public void addSong(Song song) {
      this.repo.save(song);
   }

   public List<Song> fetchAllSongs() {
      return this.repo.findAll();
   }

   public boolean songExists(String name) {
      Song song = this.repo.findByName(name);
      return song != null;
   }

   public void updateSong(Song song) {
      this.repo.save(song);
   }
}