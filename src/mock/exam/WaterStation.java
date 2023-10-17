/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mock.exam;

/**
 *
 * @author Lance Masipag
 */

// Create a WaterStation class [10pts]
public class WaterStation {
    // TODO code application logic here
    
    // Give the WaterStation class fields for name (String), rate (double) per L, and earnings (double). (2pts)
    private String name;
    private double rate;
    private double earnings;
    
    // Make a constructor for the WaterStation class that has parameters for the name and rate, and sets the earnings to 0 (2pts)
    public WaterStation(String name, double rate){
        this.name = name;
        this.rate = rate;
        earnings = 0;        
    }
    
    // Write the code for the following methods
    //     -getName(): returns name of the WaterStation(1pt)
    //     -getRate(): returns rate of the WaterStation(1pt)
    //     -getEarnings(): returns earnings of the WaterStation. (1pt)
    //     -addEarnings(double e): adds a value e to earnings (2pts)
    //     -displayStats(): prints fields and values of WaterStation(1pt)
    public String getName(){
        return name;
    }
    public double getRate(){
        return rate;
    }
    public double getEarnings(){
        return earnings;
    }
    public void addEarnings(double e){
        this.earnings += e;
    }
    public void displayStats(){
        System.out.printf("%s: Rate - %.2f per Liter, Earnings: $%.2f\n",name,rate,earnings);
    }
}
