/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise07;

/**
 *
 * @author Lance Masipag
 */
public class WaterType extends Monster{
    public WaterType(String name, int maxHP, int base) {
        super(name, "water", "fire", "grass", maxHP, base);
    }   
    
    @Override
    public void special() {
        def += 2;
        hp = (int)(0.9 * maxHP);
    }
}
