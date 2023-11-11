/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_photon_masipag_exercise06;

/**
 *
 * @author Lance Masipag
 */
import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monster fire = new FireType("Flareon",100,80);
        Monster grass = new GrassType("Decidueye",115,60);
        Monster water = new WaterType("Greninja",110,70);
        
        fight(grass, fire);
        fight(fire, water);
        fight(water, grass);
    }
    
    public static void fight(Monster m1, Monster m2){
        Random chance = new Random();
        String atkOrDef;
        //Battle between Monster 1 and Monster 2
        System.out.printf("\n\n%s (%s) vs %s (%s)\n", m1.getName(), m1.getType(),m2.getName(), m2.getType());
        while (m1.getHP() > 0 || m2.getHP() > 0){
            double m1AttackPhase = chance.nextDouble();
            atkOrDef = "atk";
            m1.performRandomAction(m1, m1AttackPhase, atkOrDef);
            atkOrDef = "def";
            double m2GuardPhase = chance.nextDouble();
            m2.performRandomAction(m2, m2GuardPhase, atkOrDef);
            m1.attack(m2);
                        
            double m2AttackPhase = chance.nextDouble();
            atkOrDef = "atk";
            m2.performRandomAction(m2, m2AttackPhase, atkOrDef);
            double m1GuardPhase = chance.nextDouble();
            atkOrDef = "def";
            m1.performRandomAction(m1, m1GuardPhase, atkOrDef);
            m2.attack(m1);
            
            if (m1.getHP() <= 0 || m2.getHP() <= 0){
                if (m1.getHP() <= 0 && m2.getHP() > 0){
                    System.out.printf("The fight has ended! %s has won!!!\n_ _ _ _ _ _ _ _ _ _ _", m2.getName());
                }
                else if (m2.getHP() <= 0 && m1.getHP() > 0){
                    System.out.printf("The fight has ended! %s has won!!!\n_ _ _ _ _ _ _ _ _ _ _", m1.getName());
                }
                else if (m1.getHP() <= 0 && m2.getHP() <= 0){
                    System.out.printf("The fight has ended! Both %s and %s died at the same time.\n_ _ _ _ _ _ _ _ _ _ _", m1.getName(), m2.getName());
                }
                break;
            }
        }
        m1.resetHealth();
        m2.resetHealth();
    }
}