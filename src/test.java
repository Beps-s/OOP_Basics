/*
 * autor - Chris Erman
 * ülesanne 6.1
 * meetod + return
 * */

import java.util.Scanner;

public class test {
    static String banner(String reklaamlause) {
        String reklaamlauseSuurteTahtedega = reklaamlause.toUpperCase();
        return reklaamlauseSuurteTahtedega;
    }

    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Mitu korda kuvada reklaamlauset: ");
        // salvestame kasutaja sisestatud väärtuse
        int korrad = sisend.nextInt();
        sisend = new Scanner(System.in);
        System.out.println("Sisesta reklaamlause: ");
        String lause = sisend.nextLine();
        int kord = 1;
        while (kord <= korrad) {
            System.out.println(banner(lause));
            kord++;
        }
    }
}