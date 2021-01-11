/*
 * autor - Chris Erman
 * ülesanne 5.4a
 * Massiivid
 * */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner lugu = new Scanner(System.in);
        System.out.println("Sisestage faili nimi: ");
        String album = lugu.nextLine();
        ArrayList<String> sisu = new ArrayList<>();
        File fail = new File("C:\\Users\\chris\\IdeaProjects\\oop_alused\\src\\" + album);
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            sisu.add(rida);
        }
        sisendFailist.close();
        int nr = 1;
        System.out.println("Muusikaplaatide valik:");
        for (int i = 0; i < sisu.size(); i++) {
            System.out.println(nr + ". " + sisu.get(i));
            nr++;
        }
        System.out.println("Millist lugu soovite mängida: ");
        int valik = lugu.nextInt();
        valik = valik - 1;
        System.out.println("Mängitav muusikapala on " + sisu.get(valik));
    }
}