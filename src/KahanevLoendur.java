public class KahanevLoendur {
    private Integer vaartus;

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
    }

    public void kahane() {
        this.vaartus = vaartus - 1;
    }
}
