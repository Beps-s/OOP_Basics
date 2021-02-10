public class MagamisTuba {
    private String nimetus;
    private Sein sein1;
    private Sein sein2;
    private Sein sein3;
    private Sein sein4;
    private Lagi lagi;
    private Voodi voodi;
    private Lamp lamp;

    public MagamisTuba(String nimetus, Sein sein1, Sein sein2, Sein sein3, Sein sein4, Lagi lagi, Voodi voodi, Lamp lamp) {
        this.nimetus = nimetus;
        this.sein1 = sein1;
        this.sein2 = sein2;
        this.sein3 = sein3;
        this.sein4 = sein4;
        this.lagi = lagi;
        this.voodi = voodi;
        this.lamp = lamp;
    }

    public void valmistaVoodi() {
        System.out.println("Magamistuba -> Valmistatakse Voodi");
        this.voodi.valmisVoodi();
    }

    public void valmistaLamp() {
        System.out.println("Magamistuba -> Valmistatakse Lamp");
        this.lamp.lulitaSisse();
    }

    public Lamp getLamp() {
        return lamp;
    }
}
