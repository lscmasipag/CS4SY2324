/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise06;

/**
 *
 * @author Lance Masipag
 */
public class WaterType extends Monster{
    private int atk;
    private int def;
    private int maxHP;
    private int hp;
    public WaterType(String name, int maxHP, int base) {
        super(name, "water", "fire", "grass", maxHP, base);
        atk = (int)(0.7 * base);
        def = (int)(1.3 * base);
    }   
    
    @Override
    public void special() {
        def += 2;
        hp = (int)(0.9 * maxHP);
    }
}
