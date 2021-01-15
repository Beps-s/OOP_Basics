/*
 * autor - Chris Erman
 * ülesanne HashMap
 * HashMap
 * */


import java.util.HashMap;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> grupp = new HashMap<String, String>();
        grupp.put("mati", "mage");
        grupp.put("mikael", "miku");
        grupp.put("kevin", "kev");
        /*
        for (String hyydnimed: grupp.keySet()) {
            System.out.println(hyydnimed + " - " + grupp.get(hyydnimed));
        }
        */
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage nimi: ");
        String nimi = sisend.nextLine();
        nimi = nimi.toLowerCase();
        System.out.println(nimi + " - " + grupp.get(nimi));
    }
}
