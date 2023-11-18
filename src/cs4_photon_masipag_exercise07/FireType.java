/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise07;

/**
 *
 * @author Lance Masipag
 */
class FireType extends Monster {
    public FireType(String name, int maxHP, int base) {
        super(name, "fire", "grass", "water", maxHP, base);
    }
    
    @Override
    public void special() {
        atk += 2;
        hp = (int)(getMaxHP() * 0.90);
    }
}
