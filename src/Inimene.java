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

    public Double getMass() {
        return mass;
    }

    public String getNimi() {
        return nimi;
    }

    public void setPikkus(Double pikkus) {
        this.pikkus = pikkus;
    }

    public Double getPikkus() {
        return pikkus;
    }

    public double kmi() {
        double tulemus = this.mass / Math.pow(this.pikkus, 2);
        return tulemus;
    }

    public void suurendaKaal() {
        this.mass++;
    }

    public void suurendaKaal(double kg) {
        this.mass += kg;
    }

    public void vahendaKaal() {
        this.mass--;
    }

    public void normaalKaal() {
        while (this.kmi() < 19.0) {
            this.suurendaKaal();
        }
        while (this.kmi() >= 25.0) {
            this.vahendaKaal();
        }
        if (this.kmi() >= 19.0 && this.kmi() < 25) {
            System.out.println(this.nimi + ", sinu kaal on normis");
        }
    }


}