public class Restoraan {
    private String nimi;
    private String tyyp;

    public Restoraan(String restoraaniNimi, String soogiTyyp) {
        this.nimi = restoraaniNimi;
        this.tyyp = soogiTyyp;
    }

    @Override
    public String toString() {
        return "Restoraani nimi on " + "'" + nimi + "'" + " ja me pakume " + tyyp;
    }
}
