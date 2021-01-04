/*
 * Muutujate kasutamise näide
 * autor - Chris Erman
 * ülesanne 1.3
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage astme alus: ");
        // salvestame kasutaja sisestatud väärtuse
        int astmeAlus = sisend.nextInt();
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage astendaja: ");
        // salvestame kasutaja sisestatud väärtuse
        int astendaja = sisend.nextInt();
        // arvutame
        int tulemus = (int) Math.pow(astmeAlus, astendaja);
        // väljastamine
        System.out.println(tulemus);
    }
}
