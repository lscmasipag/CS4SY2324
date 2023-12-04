package cs4_photon_masipag_q2_mockexam;
//Make Venue an abstract class
//Make abstract method checkAvailability() which returns a boolean value
//Make abstract method reserve()
//Make abstract method hostEvent()
public abstract class Venue implements SelfPromoting {
    private String name, location;
    private double value;

    public Venue(String s, String l, double v){
        name = s;
        location = l;
        value = v;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public double getValue(){
        return value;
    }
    @Override
    public void advertise(){
        value += 2;
    }
    public abstract boolean checkAvailability();
    public abstract void reserve();
    public abstract void hostEvent();
    
}
