/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package photon.masipag.photon.serate.photon.ragsac_2ndqtrprojectdesign;

/**
 *
 * @author Photon-Masipag-Photon-Serate-Photon-Ragsac_2ndQtrProjectDesign
 */
import java.util.ArrayList;

public class Player {
  private String name, description;
  private Location location;
  private boolean alive;
  private ArrayList<Item> inventory;
  
  public Player(String n) {
    name = n;
    alive = true;
    inventory = new ArrayList<Item>();
  }

  public void addInventory (Item i) {
    inventory.add(i);
    System.out.println(i.getName() + " has been added to your inventory.");
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

  public boolean getAlive() {
    return alive;
  }

  public void setAlive(boolean a) {
    alive = a;
  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

  public void moveLocation(Location l) {
    location = l;
  }

  public void inspectFurniture(Furniture f) {
    f.displayFurnitureMenu();
  }

  public void challenge(NPC npc) {

  }
}

