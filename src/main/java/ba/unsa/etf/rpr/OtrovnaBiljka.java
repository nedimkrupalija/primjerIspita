package ba.unsa.etf.rpr;

public class OtrovnaBiljka extends Biljka {
    private String naziv;
    private String jacina;
    public OtrovnaBiljka(String naziv, String jacina)  {
        super(naziv,jacina);
    }

    @Override
    public String toString(){
        return "Otrov: " + naziv + " - " + jacina;
    }


    @Override
    public String konzumiraj() {
        return "[ZDRAVLJE + 100]";
    }
}
