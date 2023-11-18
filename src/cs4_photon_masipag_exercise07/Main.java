/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4_photon_masipag_exercise07;

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
        Trainer trainer = new Trainer("Selene");
        Monster monster = new Monster("Decidueye","Grass", "Water", "Fire", 110, 60) {
            @Override
            public void special() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        NPC npc = new NPC("Professor Oak");
        Location location = new Location("Alola Region", "Melemele Island");
        trainer.inspect(monster);
        trainer.inspect(npc);
        trainer.inspect(location);
    }
}