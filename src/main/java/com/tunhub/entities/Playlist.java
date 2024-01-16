package com.tunhub.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Playlist {
   @Id
   @GeneratedValue(
      strategy = GenerationType.AUTO
   )
   int id;
   String name;
   @ManyToMany
   List<Song> songs;

   public Playlist() {
   }

   public Playlist(int id, String name, List<Song> songs) {
      this.id = id;
      this.name = name;
      this.songs = songs;
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

   public List<Song> getSongs() {
      return this.songs;
   }

   public void setSongs(List<Song> songs) {
      this.songs = songs;
   }

   public String toString() {
      int var10000 = this.id;
      return "Playlist [id=" + var10000 + ", name=" + this.name + ", songs=" + String.valueOf(this.songs) + "]";
   }
}
