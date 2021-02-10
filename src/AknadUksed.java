public class AknadUksed {
    private int aknaKorgus;
    private int aknaLaius;
    private int ukseKorgus;
    private int ukseLaius;
    private int usteAkendePindala;
    private int aknaPindala;
    private int uksePindala;

    public void setAknaKorgus(int aknaKorgus) {
        this.aknaKorgus = aknaKorgus;
    }

    public void setAknaLaius(int aknaLaius) {
        this.aknaLaius = aknaLaius;
    }

    public void setUkseKorgus(int ukseKorgus) {
        this.ukseKorgus = ukseKorgus;
    }

    public void setUkseLaius(int ukseLaius) {
        this.ukseLaius = ukseLaius;
    }

    public void aknaPindala(int aknaKorgus, int aknaLaius) {
        int aknaPindala = aknaKorgus * aknaLaius;
        this.aknaPindala = aknaPindala;
    }

    public void uksePindala(int ukseKorgus, int ukseLaius) {
        int uksePindala = ukseKorgus * ukseLaius;
        this.uksePindala = uksePindala;
    }

    public void usteAkendePindala(int aknaPindala, int uksePindala) {
        int usteAkendePindala = aknaPindala + uksePindala;
        this.usteAkendePindala = usteAkendePindala;
    }
}
