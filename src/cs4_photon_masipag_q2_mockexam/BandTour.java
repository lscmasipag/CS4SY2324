package cs4_photon_masipag_q2_mockexam;
public class BandTour {
    public static void main(String[] args) {
        Stadium s1 = new Stadium("SHB304", "Pisay", 10);
        Theater t1 = new Theater("SM", "QC", 80, 8);
        IndieBand i1 = new IndieBand("Lol",50,"Pisay");
        i1.reserve(t1);
        i1.perform();
        System.out.println(i1.getPopularity());
        i1.reserve(s1);
        i1.perform();
        System.out.println(i1.getPopularity());
    }
}
