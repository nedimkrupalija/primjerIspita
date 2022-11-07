package ba.unsa.etf.rpr;

public class Main {
    public static void main(String[] args) {
        Biljka l1 = new LjekovitaBiljka("Tramal","500");
        System.out.println(l1.getNaziv());
        LjekovitaBiljka l2 = new LjekovitaBiljka("Paracetamol","150");
        System.out.println(l2.getNaziv());
        System.out.println(l2.konzumiraj());
    }
}