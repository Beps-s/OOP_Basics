/*
 * Tingimuslauste kasutamise näide
 * autor - Chris Erman
 * ülesanne 2.2
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage punktide summa: ");
        // salvestame kasutaja sisestatud väärtuse
        double punktid = sisend.nextDouble();
        // kontroll
        if (punktid >= 0 && punktid < 66) {
            System.out.println("Vähem kui kandideerimiseks vajalik");
        } else if (punktid >= 66 && punktid < 85) {
            System.out.println("Kandideerimiseks vastuvõtule");
        } else if (punktid >= 85 && punktid <= 100) {
            System.out.println("Vastuvõtt tagatud");
        } else if (punktid < 0 || punktid > 100) {
            System.out.println("Vigane punktisumma");
        }
    }
}
