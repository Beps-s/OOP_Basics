/*
 * autor - Chris Erman
 * ülesanne 6.4a
 * meetod + return
 * */

import java.util.Scanner;

public class test {
    static String tervitus(int kord) {
        System.out.println("Võõrustaja: \"Tere!\"");
        System.out.println("Täna " + kord + ". kord tervitada, mõtiskleb võõrustaja.");
        System.out.println("Külaline: \"Tere, suur tänu kutse eest!\"");
        return null;
    }

    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage külaliste arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int kord = sisend.nextInt();
        int kd = 1;
        while (kord >= kd) {
            tervitus(kd);
            kd++;
        }
    }
}