/*
 * autor - Chris Erman
 * konto halduse programm
 * */

public class Test {
    public static void main(String[] args) {
        Loom minuloom = new Loom("Minu loom");
        System.out.println(minuloom);
        minuloom.soon();
        minuloom.haal();
        minuloom.jalutan();
        Kass miisu = new Kass("Miisu", "must");
        miisu.jalutan();
        miisu.soon();
        miisu.haal();

        /*Inimene mati = new Inimene("Mati");
        mati.setPikkus(1.80);
        mati.setMass(149.0);
        System.out.println(mati.getNimi() + " on " + mati.getPikkus() + "m pikk ja kaalub " + mati.getMass() + " kg");
        System.out.println("kmi = " + mati.kmi());
        System.out.printf("kmi = %.2f\n", mati.kmi());

        mati.suurendaKaal();
        System.out.println(mati.getNimi() + " on " + mati.getPikkus() + "m pikk ja kaalub " + mati.getMass() + " kg");

        mati.suurendaKaal(5.0);
        System.out.println(mati.getNimi() + " on " + mati.getPikkus() + "m pikk ja kaalub " + mati.getMass() + " kg");
        System.out.printf("kmi = %.2f\n", mati.kmi());

        mati.normaalKaal();
        System.out.println(mati.getNimi() + " on " + mati.getPikkus() + "m pikk ja kaalub " + mati.getMass() + " kg");
        System.out.printf("kmi = %.2f\n", mati.kmi());

        /*Ristkylik kujund = new Ristkylik();
        kujund.setLaius(-10.0);
        kujund.setKorgus(20.0);
        System.out.println(kujund);

        /*Menyy meieSoogid = new Menyy();
        meieSoogid.lisaSook("kana");
        meieSoogid.lisaSook("kana");
        meieSoogid.valjastaMenyy();
        meieSoogid.puhastaMenyy();
        meieSoogid.valjastaMenyy();
        KahanevLoendur loendur = new KahanevLoendur(100);
        loendur.valjastaVaartus();
        loendur.kahane();
        loendur.valjastaVaartus();
        loendur.kahane();
        loendur.valjastaVaartus();
        loendur.reset();
        loendur.valjastaVaartus();
        loendur.algvaartusta();
        loendur.valjastaVaartus();

        /*Toode meieToode = new Toode("Banaan", 1.3, 4);

        /*Konto chrisKontoSEB = new Konto("Chris", 500.0);
        Konto chrisKontoSWED = new Konto("Chris");
        chrisKontoSEB.looKonto("Chris", 0.0);
        //chrisKontoSWED.looKonto("Chris", 0.0);
        System.out.println("SEB konto omanik: " + chrisKontoSEB.omanik);
        System.out.println("SEB konto vabajääk: " + chrisKontoSEB.balance + "\n");
        System.out.println("SWED konto omanik: " + chrisKontoSWED.omanik);
        System.out.println("SWED konto vabajääk: " + chrisKontoSWED.balance + "\n");
        chrisKontoSEB.lisaRaha(20.0);
        System.out.println("SEB: " + chrisKontoSEB.balance);
        System.out.println("SWED: " + chrisKontoSWED.balance + "\n");
        chrisKontoSEB.lisaRaha(-15.0);
        System.out.println("SEB: " + chrisKontoSEB.balance);
        System.out.println("SWED: " + chrisKontoSWED.balance + "\n");
        chrisKontoSEB.votaRaha(10.0);
        System.out.println("SEB: " + chrisKontoSEB.balance);
        System.out.println("SWED: " + chrisKontoSWED.balance + "\n");
        chrisKontoSEB.votaRaha(20.0);
        System.out.println("SEB: " + chrisKontoSEB.balance);
        System.out.println("SWED: " + chrisKontoSWED.balance + "\n");
        chrisKontoSEB.teeYlekanne(chrisKontoSWED, 10.0);
        System.out.println("SEB: " + chrisKontoSEB.balance);
        System.out.println("SWED: " + chrisKontoSWED.balance + "\n");
        chrisKontoSEB.teeYlekanne(chrisKontoSWED, 10.0);
        System.out.println("SEB: " + chrisKontoSEB.balance);
        System.out.println("SWED: " + chrisKontoSWED.balance + "\n");
         */
    }
}
