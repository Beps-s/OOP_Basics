public class Ristkülik {
    private Double laius;
    private Double korgus;

    public Double getKorgus() {
        return korgus;
    }

    public void setKorgus(Double korgus) {
        this.korgus = vaartuseKontroll(korgus);
    }

    public Double getLaius() {
        return laius;
    }

    public void setLaius(Double laius) {
        this.laius = vaartuseKontroll(laius);
    }

    private Double vaartuseKontroll(Double vaartus) {
        Double tulemus;
        if (vaartus < 0.0) {
            return Math.abs(vaartus);
        }
        return vaartus;
    }

    @Override
    public String toString() {
        return "Ristkülik: " + this.laius + " x " + korgus;
    }
}
