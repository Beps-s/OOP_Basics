/*
 * autor - Chris Erman
 * konto halduse programm
 * */

public class Test {
    public static void main(String[] args) {
        Inimene matti = new Inimene("Matti");
        Inimene john = new Inimene("John");
        matti.setPikkus(180.0);
        matti.setMass(86.0);
        john.setPikkus(175.0);
        john.setMass(64.0);
        System.out.println(matti.getNimi() + ", kehamassiindeks: " + matti.kmi());
        System.out.println(john.getNimi() + ", kehamassiindeks: " + john.kmi());

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
