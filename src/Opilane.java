import java.util.ArrayList;

public class Opilane {
    //Tekitasin teadmised listi, et sellega õpilasele anda või võtta teadmisi
    ArrayList<String> teadmised = new ArrayList<>();
    private String nimi;

    public Opilane(String nimi) {
        this.nimi = nimi;
        teadmised.add("OOP");
        teadmised.add("Pärilus");
        teadmised.add("Kapseldus");
        teadmised.add("Kompositsioon");
    }

    //Õpilane unustab teema
    public void unusta(String unustabTeema) {
        if (teadmised.contains(unustabTeema)) ;
        teadmised.remove(unustabTeema);
    }

    //Õpilane õpib iseseisvalt teema
    public void opib(String opibTeema) {
        if (!teadmised.contains(opibTeema)) ;
        teadmised.add(opibTeema);
    }

    public String getNimi() {
        return nimi;
    }

    public ArrayList<String> getTeadmised() {
        return teadmised;
    }
}
