public class Inimene {
    private String nimi;
    private Double pikkus;
    private Double mass;

    public Inimene(String nimi) {
        this.nimi = nimi;
        this.pikkus = 0.0;
        this.mass = 0.0;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public String getNimi() {
        return nimi;
    }

    public Double getPikkus() {
        return pikkus;
    }

    public void setPikkus(Double pikkus) {
        this.pikkus = pikkus;
    }

    public Double kmi() {
        pikkus = pikkus / 100;
        pikkus = pikkus * pikkus;
        double kmi = mass / pikkus;
        return (kmi);
    }
}
