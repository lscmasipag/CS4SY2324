/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_photon_masipag_exercise01;

/**
 *
 * @author PHOTON
 */
public class CS4_Photon_Masipag_Exercise01 {

    /**
     * @param args the command line arguments
     */
    String hobby1 = "Playing sports";
    boolean isOutdoor1 = true;
    String isOutdoorText1 = "Yes";
    int hoursPerDay1 = 3;
   
    String hobby2 = "Playing with gadgets";
    boolean isOutdoor2 = false;
    String isOutdoorText2 = "No";
    int hoursPerDay2 = 5;
   
    String hobby3 = "Playing board games";
    boolean isOutdoor3 = false;
    String isOutdoorText3 = "No";
    int hoursPerDay3 = 2;
   
    int totalHoursPerDay = hoursPerDay1 + hoursPerDay2 + hoursPerDay3;
    boolean allOutdoor = isOutdoor1 && isOutdoor2 && isOutdoor3;
    String mostTimeAllotment;
    public static void main(String[] args) {
        // TODO code application logic here
        CS4_Photon_Masipag_Exercise01 hobby = new CS4_Photon_Masipag_Exercise01();
        if (hobby.hoursPerDay1 > hobby.hoursPerDay2 && hobby.hoursPerDay1 > hobby.hoursPerDay3){
            hobby.mostTimeAllotment = hobby.hobby1;
        }
        else if (hobby.hoursPerDay2 > hobby.hoursPerDay1 && hobby.hoursPerDay2 > hobby.hoursPerDay3){
            hobby.mostTimeAllotment = hobby.hobby2;
        }
        else {
            hobby.mostTimeAllotment = hobby.hobby3;
        }

        System.out.println("Hobby 1");
        System.out.println("Hobby: " + hobby.hobby1);
        System.out.println("An Outdoor Activity: " + hobby.isOutdoorText1);
        System.out.println("Hours Alloted per Day: " + hobby.hoursPerDay1);
        System.out.println();

        System.out.println("Hobby 2");
        System.out.println("Hobby: " + hobby.hobby2);
        System.out.println("An Outdoor Activity: " + hobby.isOutdoorText2);
        System.out.println("Hours Alloted per Day: " + hobby.hoursPerDay2);
        System.out.println();

        System.out.println("Hobby 3");
        System.out.println("Hobby: " + hobby.hobby3);
        System.out.println("An Outdoor Activity: " + hobby.isOutdoorText3);
        System.out.println("Hours Alloted per Day: " + hobby.hoursPerDay3);
        System.out.println();

        // Print other information
        System.out.println("Total time I allotted for my hobbies during summer: " + hobby.totalHoursPerDay + " hours");
        System.out.println("Are all hobbies outdoor activities: " + hobby.allOutdoor);
        System.out.println("Hobby allotted the most time: " + hobby.mostTimeAllotment);
    }    
}
