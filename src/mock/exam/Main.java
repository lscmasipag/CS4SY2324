/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mock.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Lance Masipag
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {    
        // Create a WaterTank homeTank with the owner "John", 1000 funds, and 0 amountFilled. (2pts)
        WaterTank homeTank = new WaterTank("John", 1000);
        
        // Create a WaterStation tap with the name "Tap", rate of 1.5/L, and 0 earnings. (2pts)
        // Create a WaterStation mw with the name "Manila Water", rate of 8/L, and 0 earnings. (2pts)
        // Create a WaterStation maynilad with the name "Maynilad", rate of 6.5/L and 0 earnings. (2pts)
        WaterStation tap = new WaterStation("Tap",1.5);
        WaterStation mw = new WaterStation("Manila Water",8);
        WaterStation maynilad = new WaterStation("Maynilad",6.5);
        
        // Add all the WaterStations to an ArrayList called stationList. (2pts)
        ArrayList<WaterStation> stationList = new ArrayList<>();
        stationList.add(tap);
        stationList.add(mw);
        stationList.add(maynilad);
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        // Write a loop that ends when the homeTank has been filled to more than 100L or when the user types "exit". (2pts)
        while(homeTank.getAmountFilled()<100){
            // *Ask the user for input regarding which water station the homeTank will be filled at (or "exit"). (2pts)
            System.out.print("Indicate the name of the water station: ");
            String input = br.readLine();
            if (input.equals("exit")){
                System.out.println("You have exited the application.");
                break;
            } else {
                WaterStation filler = null;
                for (int i=0; i<stationList.size(); i++){
                    if(stationList.get(i).getName().equals(input)){
                        filler = stationList.get(i);
                        break;
                    }
                }
                
                // *Ask the user for input regarding how much the homeTank will be filled using the given water station. (2pts)
                // *Have the homeTank filled using the information given (2pts)
                if (filler!=null){
                    System.out.print("How much water would you fill the tank: ");
                    double volume = Double.parseDouble(br.readLine());
                    homeTank.fill(filler, volume);
                } 
                
                // *Prints "No such water station called <input>." if user input does not match. (1pt)
                else {
                    System.out.println("No such water station called " + input + ".");
                }
                
                
            }
        }
        // When the loop ends, display the stats of homeTank and the water stations. (1pt)
        homeTank.displayStats();
        System.out.println("Water Station Stats:");
        for (WaterStation station : stationList) {
            station.displayStats();
        }
    }
    
}
