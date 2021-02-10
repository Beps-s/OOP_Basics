public class Voodi {
    private String stiil;
    private int padjad;
    private int tekid;
    private String lina;
    private int korgus;

    public Voodi(String stiil, int padjad, int tekid, String lina, int korgus) {
        this.stiil = stiil;
        this.padjad = padjad;
        this.tekid = tekid;
        this.lina = lina;
        this.korgus = korgus;
    }

    public String getStiil() {
        return stiil;
    }

    public int getPadjad() {
        return padjad;
    }

    public int getTekid() {
        return tekid;
    }

    public String getLina() {
        return lina;
    }

    public int getKorgus() {
        return korgus;
    }

    public void valmisVoodi() {
        System.out.println("Voodi -> Valmis");
    }
}
