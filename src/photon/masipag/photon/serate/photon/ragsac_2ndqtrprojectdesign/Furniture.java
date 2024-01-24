/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package photon.masipag.photon.serate.photon.ragsac_2ndqtrprojectdesign;

/**
 *
 * @author Photon-Masipag-Photon-Serate-Photon-Ragsac_2ndQtrProjectDesign
 */
public abstract class Furniture {
  protected String name, description;
  private Item requiredKey;
  private Location location;
  protected Player player; 

  public Furniture(String n, Location l, String d, Item k, Player p) {
    name = n;
    location = l;
    description = d;
    requiredKey = k;
    player = p;
    l.addFurniture(this);
  }

  public Furniture(String n, Location l, String d) {
    name = n;
    location = l;
    description = d;
    l.addFurniture(this);
  }

  public String getName() {
    return name;
  }

  public Location getLocation() {
    return location;
  }

  public String getDescription() {
    return description;
  }

  public Item getRequiredKey() {
    return requiredKey;
  }

  public void displayFurnitureMenu() {
    System.out.println(description); 
  }
}

