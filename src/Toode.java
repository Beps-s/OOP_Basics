public class Toode {
    public String nimetus;
    public Double hind;
    public Integer kogus;

    public Toode(String nimetus, Double hind, Integer kogus) {
        this.valjastaToode(nimetus, hind, kogus);
        System.out.println("toode: " + nimetus);
        System.out.println("hind: " + hind + "€");
        System.out.println("kogus: " + kogus);
    }

    public void valjastaToode(String nimetus, Double hind, Integer kogus) {
        this.nimetus = nimetus;
        this.hind = hind;
        this.kogus = kogus;
    }
}
