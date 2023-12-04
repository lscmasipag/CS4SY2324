package cs4_photon_masipag_q2_mockexam;
public abstract class Band {
    private String name;
    protected Venue selectedVenue;
    private int popularity, performances;

    public Band(String s, int p){
        name = s;
        popularity = p;
        performances = 0;
    }
    public int getPerformances(){
        return performances;
    }
    public int getPopularity(){
        return popularity;
    }
    public void reserve(Venue v){
        if(v.checkAvailability()){
            System.out.printf("%s was reserved.", v.getName());
            v.reserve();
            selectedVenue = v;
        }
    }
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            selectedVenue = null;
            popularity += 5;
            performances++;
        }
    }
    public void increasePopularity(int inc){
        popularity += inc;
    }
    public void increasePerformances(){
        performances++;
    }
}
