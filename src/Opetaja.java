public class Opetaja {
    private String nimi;

    public Opetaja(String nimi) {
        this.nimi = nimi;
    }

    //Õpetaja õpetab õpilastele teemad (Puudu)
    public void opetab(Opilane opilane, String teema) {
        opilane.opib(teema);
    }
}
//Vigade parandus sisse viidud