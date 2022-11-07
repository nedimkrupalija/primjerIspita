package ba.unsa.etf.rpr;

public class LjekovitaBiljka extends Biljka{
    private String jacina;
    private String naziv;
    public LjekovitaBiljka(String naziv, String jacina){
        super(naziv,jacina);
    }


@Override
    public String toString(){
        return "Lijek: " + naziv + " - " + jacina;
}

    @Override
    public String konzumiraj() {
        return "[ZRAVLJE + 100]";
    }
}
