public class KahanevLoendur {
    private Integer vaartus;
    public Integer algvaartus;

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
        this.algvaartus = vaartusAlguses;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
        int algvaartus = vaartus;
    }

    public void kahane() {
        if (vaartus > 0) {
            this.vaartus = vaartus - 1;
        } else {
            this.vaartus = vaartus;
        }
    }

    public void reset() {
        this.vaartus = 0;
    }

    public void algvaartusta() {
        this.vaartus = algvaartus;
    }
}
