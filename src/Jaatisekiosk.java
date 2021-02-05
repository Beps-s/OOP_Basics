import java.util.ArrayList;

public class Jaatisekiosk extends Restoraan {
    private ArrayList<String> jaatised;

    public Jaatisekiosk(String nimi, String tyyp) {
        super(nimi, tyyp);
        this.jaatised = new ArrayList<>();
    }

    public void lisaJaatis(String jaatis) {
        if (!jaatised.contains(jaatis)) {
            jaatised.add(jaatis);
        }
    }

    public ArrayList<String> getJaatised() {
        return jaatised;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJäätisevalik: " + this.jaatised;
    }
}
