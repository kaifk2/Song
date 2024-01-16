package com.tunhub.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Song {

	 @Id
	   @GeneratedValue(
	      strategy = GenerationType.AUTO
	   )
	   int id;
	   String name;
	   String artist;
	   String genre;
	   String link;
	   @ManyToMany
	   List<Playlist> playlists;

	   public Song() {
	   }

	   public Song(int id, String name, String artist, String genre, String link, List<Playlist> playlists) {
	      this.id = id;
	      this.name = name;
	      this.artist = artist;
	      this.genre = genre;
	      this.link = link;
	      this.playlists = playlists;
	   }

	   public int getId() {
	      return this.id;
	   }

	   public void setId(int id) {
	      this.id = id;
	   }

	   public String getName() {
	      return this.name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public String getArtist() {
	      return this.artist;
	   }

	   public void setArtist(String artist) {
	      this.artist = artist;
	   }

	   public String getGenre() {
	      return this.genre;
	   }

	   public void setGenre(String genre) {
	      this.genre = genre;
	   }

	   public String getLink() {
	      return this.link;
	   }

	   public void setLink(String link) {
	      this.link = link;
	   }

	   public List<Playlist> getPlaylists() {
	      return this.playlists;
	   }

	   public void setPlaylists(List<Playlist> playlists) {
	      this.playlists = playlists;
	   }

	   public String toString() {
	      int var10000 = this.id;
	      return "Song [id=" + var10000 + ", name=" + this.name + ", artist=" + this.artist + ", genre=" + this.genre + ", link=" + this.link + ", playlists=" + String.valueOf(this.playlists) + "]";
	   }
}
