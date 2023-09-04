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
public class Genre {
    String genre;
    public Genre(String g){
        genre = g;
    }
    public void printGenre(){
        System.out.println("The genre of the  new song is '" + genre + "'.");
    }
}
