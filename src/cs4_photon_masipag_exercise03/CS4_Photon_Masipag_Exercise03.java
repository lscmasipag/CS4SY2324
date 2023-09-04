/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_photon_masipag_exercise03;

/**
 *
 * @author Lance Masipag
 */
public class CS4_Photon_Masipag_Exercise03 {

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
        Song song3 = new Song("Finesse","Bruno Mars");
        Singer singer1 = new Singer("Bruno Mars");
        Singer singer2 = new Singer("Cardi B");

        song1.printTitleArtist();
        genre1.printGenre();
        singer1.changeFavSong("The Lazy Song");
        singer1.performForAudience(12,1);
        
        song2.printTitleArtist();
        genre2.printGenre();
        singer1.changeFavSong("When I was Your Man");
        singer1.performForAudience(15,1);
        
        song3.printTitleArtist();
        singer1.changeFavSong("Finesse");
        singer2.changeFavSong("Finesse");
        singer1.performForAudience(15,2);
        singer2.performForAudience(15,2);
        
        System.out.println("\nThe total performances of all the singers is " + Singer.totalPerformances() + ".");
    }
}