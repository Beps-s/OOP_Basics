/*
 * Tingimuslauste kasutamise näide
 * autor - Chris Erman
 * ülesanne 2.3c
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage inimeste arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int inimesed = sisend.nextInt();
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage kohtade arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int kohad = sisend.nextInt();
        // programm peaks välja arvutama mitut bussi on vaja. -viga-
        int buss = Math.floorDiv(inimesed, kohad);
        // programm peab veel arvutama välja mitu inimest viimases bussis on
        System.out.println(buss);

    }
}
