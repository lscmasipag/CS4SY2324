package cs4_photon_masipag_q2_mockexam;
//Make Stadium a subclass of Venue
//Remove redundancies with superclass
//Define checkAvailability() such that it returns the value of reserved.
//Define reserve() such that the value of reserved set to true
//Define hostEvent() such that the value of reserved set to false
public class Stadium extends Venue {
    private boolean reserved;

    public Stadium(String n, String l, double v){
        super(n, l, v);
        reserved = false;
    }
    @Override
    public boolean checkAvailability() {
        return !reserved;
    }

    @Override
    public void reserve() {
        reserved = true;
    }
    @Override
    public void hostEvent() {
        reserved = false;
    }

}
