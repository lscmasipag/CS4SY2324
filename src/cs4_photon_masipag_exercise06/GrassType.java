/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise06;

/**
 *
 * @author Lance Masipag
 */
public class GrassType extends Monster{
    private int atk;
    private int def;
    private int maxHP;
    private int hp;
    public GrassType(String name, int maxHP, int base) {
        super(name, "grass", "water", "fire", maxHP, base);
        atk = base;
        def = base;
    }   
    
    @Override
    public void special() {
        super.special();
        atk += 2;
        maxHP = (int)(1.2 * maxHP);
    }
    public void rest(){
        super.rest();
        hp = (int)(1.5 * maxHP);
    }
}