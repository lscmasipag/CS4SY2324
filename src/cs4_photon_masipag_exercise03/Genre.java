/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise03;

/**
 *
 * @author Lance Masipag
 */
public class Genre {
    String genre;
    public Genre(String g){
        genre = g;
    }
    public void printGenre(){
        System.out.println("The genre of the  new song is '" + genre + "'.");
    }
}
