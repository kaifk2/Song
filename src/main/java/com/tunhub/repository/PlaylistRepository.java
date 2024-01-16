package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhub.entities.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

}
