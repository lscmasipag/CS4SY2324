package cs4_photon_masipag_exercise07;

import java.util.ArrayList;

public class Location implements Interactive {
    private String name;
    private ArrayList<Character> personList;
    private String localSpecialty;

    public Location(String n){
        this.name = n;
        this.localSpecialty = null;
        this.personList = new ArrayList<>();
    }
    public Location(String n, String s){
        this.name = n;
        this.localSpecialty = s;
        this.personList = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Character> getPersonList(){
        return personList;
    }
    public void addPerson(Character c){
        personList.add(c);
    }
    public void removePerson(Character c){
        personList.remove(c);
    }

    @Override
    public void interact(){
        System.out.printf("You are currently in %s! Its local specialty is %s.",name, localSpecialty);
    }
}
