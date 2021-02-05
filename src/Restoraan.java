public class Restoraan {
    private String nimi;
    private String tyyp;
    private int kylalised;

    public Restoraan(String nimi, String tyyp) {
        this.nimi = nimi;
        this.tyyp = tyyp;
    }

    public void avaRestoran() {
        System.out.println("Restroraan on avatud");
    }

    public void setKylalised(int kylalised) {
        this.kylalised = kylalised;
    }

    public void teenindatudKylalisedPaevas() {
        int teenindatud = this.kylalised;
        System.out.println("Külalisi teenindatud täna: " + teenindatud);
    }

    public String getNimi() {
        return nimi;
    }

    public String getTyyp() {
        return tyyp;
    }

    @Override
    public String toString() {
        return "Restoraani nimi on " + nimi + " ja menüüs meil " + tyyp;
    }
}
