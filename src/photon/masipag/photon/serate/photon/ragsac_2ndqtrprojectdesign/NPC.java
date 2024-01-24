/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package photon.masipag.photon.serate.photon.ragsac_2ndqtrprojectdesign;

/**
 *
 * @author Photon-Masipag-Photon-Serate-Photon-Ragsac_2ndQtrProjectDesign
 */
import java.util.Random;

public class NPC {
  private String name, description, aggressionStatus;
  private Location location;
  private int aggressionLvl, aggressionIncFactor;
  private Item itemPossession;
  private Player player; 

  public NPC(String n, String d, String s, Location l, int lvl, int factor, Item ip, Player player) {
    name = n;
    description = d;
    aggressionStatus = s;
    location = l;
    aggressionLvl = lvl;
    aggressionIncFactor = factor;
    itemPossession = ip;
    this.player = player;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Location getLocation() {
    return location;
  }

  public int getAggressionLvl() {
    return aggressionLvl;
  }

  public String getAggressionStatus() {
    return aggressionStatus;
  }

  public int getAggressionIncFactor() {
    return aggressionIncFactor;
  }
  
  public Item getItemPossession() {
    return itemPossession;
  }

  public void aggressionManipulation(Player p) {
    if (this.getLocation() == p.getLocation()) {
      this.aggressionLvl += aggressionIncFactor;
    }
  }

  public void attack(Player p) {
    // Implement the logic for the attack here
  }

  public void attackChance() {
    Random initialGameRandom = new Random();
    int npcTurnSeed = initialGameRandom.nextInt(500) + 1;
    if (npcTurnSeed < aggressionLvl) {
      attack(player); // Use the player instance stored in the class
    }
  }
}
