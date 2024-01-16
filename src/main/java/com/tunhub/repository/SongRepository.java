package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhub.entities.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {
   Song findByName(String name);
}
