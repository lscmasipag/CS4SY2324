/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_photon_masipag_exercise02;

/**
 *
 * @author PHOTON
 */
public class Song {
    String title;
    String artist;
   
    public Song(String t, String a){
        title = t;
        artist = a;
    }
   
    public void printTitleArtist(){
        System.out.println("A new song has been added... '" + title + "' by " + artist + ".");
    }
}
