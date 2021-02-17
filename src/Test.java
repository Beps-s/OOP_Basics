/*
 * author - Chris Erman
 * */

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //Vigade parandus sisse viidud
        // moodustame õpetatavate teemade nimekirja
        ArrayList<String> teemad = new ArrayList<>();
        teemad.add("OOP");
        teemad.add("Pärilus");
        teemad.add("Kapseldus");
        teemad.add("Kompositsioon");
        // loome õpetaja
        Opetaja opetaja = new Opetaja("Anna");

        // Loome klass
        ArrayList<Opilane> ita21 = new ArrayList<>();
        Opilane mati = new Opilane("Mati");
        Opilane kati = new Opilane("Kati");
        ita21.add(mati);
        ita21.add(kati);

        // Õpetaja õpetab oma õpilased
        oppetoo(teemad, ita21, opetaja);

        // teadmiste kontroll pärast aine lõpetamiset
        teadmisteKontroll(ita21);
        // ühe nädala pärast Mati unustab teemat Kapseldust
        mati.unusta("Kapseldus");
        System.out.println("Mati unustas eelneva teema");
        // kontrollime uuesti teadmised
        teadmisteKontroll(ita21);
        // las Mati uuesti õpib kalselduse teemad
        mati.opib("Kapseldus");
        System.out.println("Mati õppis uue teema");
        // kontrollime uuesti teadmised
        teadmisteKontroll(ita21);


    }

    public static void teadmisteKontroll(ArrayList<Opilane> grupp) {
        for (Opilane opilane : grupp) {
            System.out.println("Opilane " + opilane.getNimi() + " teadmised:");
            for (String teadmine : opilane.getTeadmised()) {
                System.out.println(teadmine);
            }
            System.out.println();
        }
    }

    public static void oppetoo(ArrayList<String> teemad, ArrayList<Opilane> grupp, Opetaja opetaja) {
        for (String teema : teemad) {
            for (Opilane opilane : grupp) {
                opetaja.opetab(opilane, teema);
            }
        }

        /*AknadUksed aken = new AknadUksed();
        aken.setAknaKorgus(50);
        aken.setAknaLaius(50);
        AknadUksed uks = new AknadUksed();
        uks.setUkseKorgus(200);
        uks.setUkseLaius(100);
        Tuba tuba = new Tuba();
        tuba.setKorgus(250);
        tuba.setLaius(400);
        tuba.setPikkus(600);
        System.out.println(tuba.getSeinaPindala());
        System.out.println(tuba);

        /*Sein seinPohi = new Sein("põhi");
        Sein seinLouna = new Sein("lõuna");
        Sein seinLaane = new Sein("lääne");
        Sein seinIda = new Sein("ida");
        Lagi lagi = new Lagi(2.5, "valge");
        Voodi voodi = new Voodi("kahele", 2, 1, "valge", 70);
        Lamp lamp = new Lamp("Klassikaline", false);

        MagamisTuba magamisTuba = new MagamisTuba("Külaliste magamistuba", seinPohi, seinLouna, seinLaane, seinIda, lagi, voodi, lamp);
        magamisTuba.valmistaVoodi();
        magamisTuba.valmistaLamp();
        System.out.println(magamisTuba.getLamp().isSisseLulitatud());

        /*Restoraan McDonalds = new Restoraan("McDonalds", "Burger");
        System.out.println(McDonalds);
        McDonalds.avaRestoran();
        McDonalds.setKylalised(20);
        McDonalds.teenindatudKylalisedPaevas();
        System.out.println("\n");
        Restoraan Jäätisekiosk = new Jaatisekiosk("Jäätisised", "Jäätis");

        System.out.println(Jäätisekiosk);
        Jäätisekiosk.avaRestoran();
        Jäätisekiosk.setKylalised(12);
        Jäätisekiosk.teenindatudKylalisedPaevas();

        /*Loom minuloom = new Loom("Minu loom");
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
