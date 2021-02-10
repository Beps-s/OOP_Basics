public class Tuba {
    private int laius;
    private int pikkus;
    private int korgus;
    private int esimeneSein;
    private int teineSein;
    private int seinaPindala;
    private AknadUksed usteAkendePindala;

    public void seinaPindala(int esimeneSein, int teineSein) {
        int kaheSeinaPindala = esimeneSein * teineSein;
        int seinaPindala = kaheSeinaPindala * 2;
        this.seinaPindala = seinaPindala;
    }

    public AknadUksed getUsteAkendePindala() {
        return usteAkendePindala;
    }

    public void setLaius(int laius) {
        this.laius = laius;
    }

    public void setPikkus(int pikkus) {
        this.pikkus = pikkus;
    }

    public void setKorgus(int korgus) {
        this.korgus = korgus;
    }

    public void esimeneSein(int korgus, int laius) {
        int esimeneSein = korgus * laius;
        this.esimeneSein = esimeneSein;
    }

    public void teineSein(int korgus, int pikkus) {
        int teineSein = korgus * pikkus;
        this.teineSein = teineSein;
    }

    public int getSeinaPindala() {
        return seinaPindala;
    }

    //public int tapeediKogus(){
    //int tapeediKogus = seinaPindala - usteAkendePindala
    //return tapeediKogus;
    //}
}
