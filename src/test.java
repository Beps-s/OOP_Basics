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
        System.out.println("Sisestage kursuste arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int ainepunktid = sisend.nextInt();
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage nädalate arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int weeks = sisend.nextInt();
        // arvutame
        int arvud = Math.multiplyExact(ainepunktid, 26);
        float summa = Math.floorDiv(arvud, weeks);
        System.out.println(summa);

    }
}
