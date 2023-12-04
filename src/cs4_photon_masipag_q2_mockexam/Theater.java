package cs4_photon_masipag_q2_mockexam;
//Make Theater a subclass of Venue
//Remove redundancies with superclass
//Define checkAvailability() such that if numStages is greater than 0, it returns true. If numStages is 0, return false
//Define reserve() such that numStages is reduced by 1
//Define hostEvent() such that numStages is increased by 1
public class Theater extends Venue{
    private int numStages;

    public Theater(String n, String l, double v, int num){
        super(n,l,num);
        numStages = num;
    }
    public int getNumStages(){
        return numStages;
    }

    @Override
    public boolean checkAvailability() {
        if (numStages > 0) return true;
        else return false;
    }

    @Override
    public void reserve() {
        numStages--;
    }

    @Override
    public void hostEvent() {
        numStages++;
    }
}
