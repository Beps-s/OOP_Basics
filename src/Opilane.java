import java.util.ArrayList;

public class Opilane {
    private String nimi;
    private ArrayList<String> teadmised;

    //tekib õpilane
    public Opilane(String nimi) {
        this.nimi = nimi;
        teadmised = new ArrayList<>();
    }

    //Õpilane unustab teema
    public void unusta(String unustabTeema) {
        for (int i = 0; i < teadmised.size(); i++) {
            String jooksevTeema = teadmised.get(i);
            if (jooksevTeema.equals(unustabTeema)) {
                teadmised.remove(i);
            }
        }
    }

    //Õpilane õpib iseseisvalt teema
    public void opib(String opibTeema) {
        teadmised.add(opibTeema);
    }

    public String getNimi() {
        return nimi;
    }

    public ArrayList<String> getTeadmised() {
        return teadmised;
    }
}
