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
    //public int initialMaxHP;
    public GrassType(String name, int maxHP, int base) {
        super(name, "grass", "water", "fire", maxHP, base);
    }
    //public void resetMaxHP(){
        //maxHP = initialMaxHP;
    //}
    @Override
    public void special() {
        super.special();
        hp = hp +(int)(0.2 * maxHP);
        if (hp > maxHP){
            hp = maxHP;
        }
    }
    @Override
    public void rest(){
        super.rest();
        hp += (int)(0.5 * maxHP);
        if (hp > maxHP){
            hp = maxHP;
        }
    }
}