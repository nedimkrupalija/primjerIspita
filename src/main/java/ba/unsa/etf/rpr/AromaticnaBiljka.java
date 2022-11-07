package ba.unsa.etf.rpr;

import java.util.Objects;

public class AromaticnaBiljka extends Biljka {
    private String naziv;
    private String jacina;
    public AromaticnaBiljka(String naziv, String jacina) {
        super(naziv, jacina);
    }


    @Override
    public String toString() {
        return "Aroma: " + naziv + " - " + jacina;
    }

    @Override
    public String konzumiraj() {
        return "[AROMA + 100]";
    }
}
