/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise03;

/**
 *
 * @author Lance Masipag
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private String favoriteSong;
    private static int totalPerformances = 0;

    public Singer(String n){
        name = n;
        noOfPerformances = 0;
        earnings = 0.00;
    }

    public void performForAudience(int numberOfPeople, int numberOfSingers){
        noOfPerformances += 1;
        totalPerformances += 1;
        earnings += (numberOfPeople * 100.00)/numberOfSingers;
        System.out.println(name + " sang " + favoriteSong + ", to an audience of " + numberOfPeople + " people.");
        System.out.println(name + " performed " + noOfPerformances + " time/s" + " and earned Php " + earnings + " already.");
    }

    public void changeFavSong(String newFavSong){
        favoriteSong = newFavSong;
        System.out.println(name + "' new favorite song is " + favoriteSong + ".");
    }
    
    public static int totalPerformances(){
        return totalPerformances;
    }
}
