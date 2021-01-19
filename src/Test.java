/*
 * autor - Chris Erman
 * konto halduse programm
 * */

public class Test {
    public static void main(String[] args) {
        Konto chrisKontoSEB = new Konto();
        Konto chrisKontoSWED = new Konto();

        chrisKontoSEB.looKonto("Chris", 0.0);
        chrisKontoSWED.looKonto("Chris", 0.0);
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
    }
}
