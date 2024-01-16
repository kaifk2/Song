package com.tunhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


import com.tunhub.entities.Song;
import com.tunhub.services.SongService;

@Controller
public class SongController {
   @Autowired
   SongService service;

   public SongController() {
   }

   @PostMapping("/addSong")
   public String addSong(@ModelAttribute Song song) {
      boolean songStatus = this.service.songExists(song.getName());
      if (!songStatus) {
         this.service.addSong(song);
         System.out.println("Song added successfully");
      } else {
         System.out.println("Song already exists");
      }

      return "adminHome";
   }

   @GetMapping("/viewSongs")
   public String viewSongs(Model model) {
	   
	   List<Song> songsList = service.fetchAllSongs();
	      model.addAttribute("songs", songsList);
	      return "displaySongs"; 
   }

   @GetMapping("/playSongs")
   public String playSongs(Model model) {
     
	   boolean premiumUser = false;
	   
      if (premiumUser == true) {
         List<Song> songsList = service.fetchAllSongs();
         model.addAttribute("songs", songsList);
         return "displaySongs";
      } else {
         return "makePayment";
      }
   }
}