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
import java.util.Scanner;

public class Location {
  private String name;
  private ArrayList<Location> connectedLocations;
  private ArrayList<Furniture> containedFurniture;
  private boolean lockStatus;
  private Player player; 


  public Location(String n, boolean l, Player p) {
    name = n;
    connectedLocations = new ArrayList<Location>();
    containedFurniture = new ArrayList<Furniture>();
    lockStatus = l;
    player = p;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Location> getConnectedLocations() {
    return connectedLocations;
  }

  public ArrayList<Furniture> getContainedFurniture() {
    return containedFurniture;
  }

  public boolean getLockStatus() {
    return lockStatus;
  }

  public void addConnection(Location l) {
    connectedLocations.add(l);
  }

  public void addFurniture(Furniture f) {
    containedFurniture.add(f);
  }

  public void displayLocationMenu() {
    String input = "";
    Scanner sc = new Scanner(System.in);
    System.out.println("You are in the " + name + ".\nWhat do you want to do: ");
    input = sc.nextLine();

    switch (input) {
      case "Move Rooms":
        System.out.println("\n----------------\n\nWhich room do you want to move to?");
        for (int i = 0; i < connectedLocations.size(); i++) {
          System.out.print(connectedLocations.get(i).getName());
          if (i < connectedLocations.size() - 1) {
            System.out.print(", ");
          }
        }

        System.out.println("\nEnter your choice: ");
        input = sc.nextLine();

        boolean validMove = false;
        int index = -1;
        for (int i = 0; i < connectedLocations.size(); i++) {
          if (input.equalsIgnoreCase(connectedLocations.get(i).getName())) {
            validMove = true;
            index = i;
            break;
          }
        }

        if (validMove && index != -1 && !connectedLocations.get(index).getLockStatus()) {
          player.moveLocation(connectedLocations.get(index));
        }
        break;

      case "Interact with Furniture":
        System.out.println("\n----------------\n\nWhich furniture do you want to interact with?");
        for (int i = 0; i < containedFurniture.size(); i++) {
          System.out.print(containedFurniture.get(i).getName());
          if (i < containedFurniture.size() - 1) {
            System.out.print(", ");
          }
        }

        System.out.println("\nEnter your choice: ");
        input = sc.nextLine();

        validMove = false;
        index = -1;
        for (int i = 0; i < containedFurniture.size(); i++) {
          if (input.equalsIgnoreCase(containedFurniture.get(i).getName())) {
            validMove = true;
            index = i;
            break;
          }
        }

        if (validMove && index != -1) {
          containedFurniture.get(index).displayFurnitureMenu();
        }
        break;

      case "Interact with NPC":
        break;

      case "Use Item":
        break;
    }
  }
}