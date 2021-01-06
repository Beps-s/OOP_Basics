/*
 * autor - Chris Erman
 * ülesanne 3.4b
 * while tsükkel
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage mitu ruutu kõnniti: ");
        // salvestame kasutaja sisestatud väärtuse
        int korrad = sisend.nextInt();
        // korduv tegevus
        int nisu = 0;
        int kord = 0;
        while (kord < korrad) {
            nisu = nisu * 2;
            if (nisu == 0) {
                nisu++;
            }
            kord++;
        }
        System.out.println("nisuteri " + kord + ". ruudu eest: " + nisu);
    }
}