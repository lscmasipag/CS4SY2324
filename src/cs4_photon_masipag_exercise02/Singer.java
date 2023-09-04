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
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    String favoriteSong;
   
    public Singer(String n){
        name = n;
        noOfPerformances = 0;
        earnings = 0.00;
    }
   
    public void performForAudience(int numberOfPeople){
        noOfPerformances += 1;
        earnings += numberOfPeople * 100.00;
        System.out.println(name + " sang " + favoriteSong + ", to an audience of " + numberOfPeople + " people.");
        System.out.println(name + " performed " + noOfPerformances + " time/s" + " and earned Php " + earnings + " already.");
    }
   
    public void changeFavSong(String newFavSong){
        favoriteSong = newFavSong;
        System.out.println(name + "' new favorite song is " + favoriteSong + ".");
    }
}
