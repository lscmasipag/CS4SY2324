/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_photon_masipag_exercise06;

/**
 *
 * @author Lance Masipag
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FireType fire = new FireType("Flareon",100,80);
        GrassType grass = new GrassType("Decidueye",100,80);
        WaterType water = new WaterType("Greninja",100,80);
        System.out.println("Grass vs Water");
        water.guard();
        grass.attack(water);
        water.special();
        grass.guard();
        water.attack(grass);
    }
    
}
