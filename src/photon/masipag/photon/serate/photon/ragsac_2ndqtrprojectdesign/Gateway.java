/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package photon.masipag.photon.serate.photon.ragsac_2ndqtrprojectdesign;

/**
 *
 * @author Photon-Masipag-Photon-Serate-Photon-Ragsac_2ndQtrProjectDesign
 */
public class Gateway extends Furniture {
  private Location roomLocked;
  private int password;

  public Gateway(String n, Location l, String d, Location rl, int p) {
    super(n, l, d);
    roomLocked = rl;
    password = p;
  }

  public Location getRoomLocked() {
    return roomLocked;
  }
  public int getPassword() {
    return password;
  }
  // why is it erroring im so confused
  @Override
  public void displayFurnitureMenu() {
      System.out.println("\nRoom Lock Status: " + getRoomLocked());
  }
}
