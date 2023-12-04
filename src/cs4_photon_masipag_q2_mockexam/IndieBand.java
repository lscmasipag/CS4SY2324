package cs4_photon_masipag_q2_mockexam;
//Make IndieBand a subclass of Band
//Remove redundancies with superclass
//Override the perform() method such that if the Venue location is the same as the IndieBand’s origin, popularity increase is doubled
public class IndieBand extends Band implements SelfPromoting{
    private String origin;

    public IndieBand(String s, int p, String o){
        super(s, p);
        origin = o;
    }
    @Override
    public void perform(){
        if(selectedVenue != null){
            increasePerformances();
            System.out.println(selectedVenue.getLocation());
            System.out.println(origin);
            if(selectedVenue.getLocation().equals(origin)){
                System.out.println("Same location.");
                increasePopularity(10);
            } else {
                increasePopularity(5);
            }
            selectedVenue.hostEvent();
            selectedVenue = null;
        }
    }

    @Override
    public void advertise() {
        increasePopularity(getPerformances()/10);
    }
}
