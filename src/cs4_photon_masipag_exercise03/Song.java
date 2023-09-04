/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise03;

/**
 *
 * @author Lance Masipag
 */
public class Song {
    String title;
    String artist;

    public Song(String t, String a){
        title = t;
        artist = a;
    }

    public void printTitleArtist(){
        System.out.println("\n\nA new song has been added... '" + title + "' by " + artist + ".");
    }
}
