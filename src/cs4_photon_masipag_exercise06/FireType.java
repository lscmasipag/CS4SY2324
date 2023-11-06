/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise06;

/**
 *
 * @author Lance Masipag
 */
class FireType extends Monster {
    private int atk;
    private int def;
    private int maxHP;
    private int hp;
    public FireType(String name, int maxHP, int base) {
        super(name, "fire", "grass", "water", maxHP, base);
        atk = (int) (1.3 * base);
        def = (int) (0.7 * base);
        this.maxHP = maxHP;
    }

    @Override
    public void special() {
        super.special();
        atk += 2;
        hp = (int)(maxHP * 0.90);
    }
}
