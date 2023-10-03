/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4_photon_masipag_exercise05;

/**
 *
 * @author PHOTON
 */
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if (index >= 0 && index < itemList.size()){
        Item i = itemList.get(index);
        earnings += i.getCost();
        System.out.printf("\n'%s' sold a '%s' for $%.2f.\n",this.getName(),i.getName(),i.getCost());
    } else {
        System.out.printf("\nThere are only %d items in '%s'.\n", itemList.size(),this.getName());
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean itemSold = false;
    for (Item i : itemList){
        if (i.getName().equals(name)) {
            earnings += i.getCost();
            System.out.printf("\n'%s' sold a '%s' for $%.2f.\n",this.getName(),name,i.getCost());
            itemSold = true;
            break;
        }
    }
    if (!itemSold) {
        System.out.printf("\n'%s' doesn't sell '%s'.\n", this.getName(), name);
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if (itemList.contains(i)){
        earnings += i.getCost();
        System.out.printf("\n'%s' sold a '%s' for $%.2f.\n", this.getName(),i.getName() , i.getCost());
    } else {
        System.out.printf("\n'%s' doesn't sell '%s'.\n", this.getName(),i.getName());
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("\nThis is the filtered list of all the items which are %s.\n", type);
    for (Item item : itemList){
        if (item.getType().equals(type)){
            System.out.printf("%s -- Type: %s, Cost: $%.2f.\n",item.getName(),item.getType(),item.getCost());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("\nThis is the filtered list of all the items with lower or equal prices to $%.2f.\n", maxCost);
    for (Item item : itemList){
        if (item.getCost() <= maxCost){
            System.out.printf("%s -- Type: %s, Cost: $%.2f.\n",item.getName(),item.getType(),item.getCost());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("\nThis is the filtered list of all the items with equal or higher prices to $%.2f.\n", minCost);
    for (Item item : itemList){
        if (item.getCost() >= minCost){
            System.out.printf("%s -- Type: %s, Cost: $%.2f.\n",item.getName(),item.getType(),item.getCost());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _\n\nStore Statistics:");
    for (Store store : storeList){
        System.out.printf("\n\t%s earned $%.2f.\n", store.getName(), store.getEarnings());
    }
  }
}