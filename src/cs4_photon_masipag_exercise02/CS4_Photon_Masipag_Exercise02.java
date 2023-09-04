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
public class CS4_Photon_Masipag_Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Genre genre1 = new Genre("Reggae");
        Genre genre2 = new Genre("Pop");
        Genre genre3 = new Genre("Funk");
        Song song1 = new Song("The Lazy Song","Bruno Mars");
        Song song2 = new Song("When I was Your Man","Bruno Mars");
        Singer singer = new Singer("Bruno Mars");
   
        song1.printTitleArtist();
        genre1.printGenre();
        singer.changeFavSong("The Lazy Song");
        singer.performForAudience(12);    
        song2.printTitleArtist();
        genre2.printGenre();
        singer.changeFavSong("When I was Your Man");  
    }
}
