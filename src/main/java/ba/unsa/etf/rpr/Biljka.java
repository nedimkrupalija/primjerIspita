package ba.unsa.etf.rpr;

import java.util.Objects;

public abstract class Biljka implements Konzumabilno {
    private String naziv;
    private String jacina;
    public Biljka(String naziv, String jacina) throws IllegalArgumentException
    {
        if(Integer.parseInt(jacina)<0) throw new IllegalArgumentException("Jacina mora biti veca ili jednaka 0");
        this.naziv = naziv;
        this.jacina = jacina;
    }




    public  String getNaziv(){
        return naziv;
    }
    public  String getJacina(){
        return jacina;
    }
    public  void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public  void setJacina(String jacina)
    {
        this.jacina = jacina;
    }

    @Override
    public  boolean equals(Object o){
        if(this == o) return true;
        Biljka b = (Biljka) o;
        return (b.naziv == naziv);
    }


    //@Override
   // public boolean equals(Object o) {
      //  if (this == o) return true;
     //   if (o == null || getClass() != o.getClass()) return false;
      //  Biljka biljka = (Biljka) o;
      //  return Objects.equals(naziv, biljka.naziv) && Objects.equals(jacina, biljka.jacina);
    //}

    @Override
    public abstract String toString();
}
