/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package photon.masipag.photon.serate.photon.ragsac_2ndqtrprojectdesign;

/**
 *
 * @author Photon-Masipag-Photon-Serate-Photon-Ragsac_2ndQtrProjectDesign
 */
public class StorageSpace extends Furniture {
  private Item itemContent;
  private boolean lockStatus;
  private Player player;

  public StorageSpace(String n, Location l, String d, Item k, Player p, Item ic, boolean ls) {
    super(n, l, d, k, p);
    itemContent = ic;
    lockStatus = ls;
    player = p;
  }

  public StorageSpace(String n, Location l, String d, Item ic, Player p) {
    super(n, l, d);
    itemContent = ic;
    lockStatus = false;
    player = p;
  }

  public boolean isLockStatus() {
    return lockStatus;
  }


  @Override 
  public void displayFurnitureMenu() {
    System.out.println(description);
    player.addInventory(itemContent);
    itemContent = null;
  }
}
