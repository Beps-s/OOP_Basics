public class KahanevLoendur {
    private Integer vaartus;

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
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
}
