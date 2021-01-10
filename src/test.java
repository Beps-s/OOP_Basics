/*
 * autor - Chris Erman
 * ülesanne 6.4a
 * meetod + return
 * */

import java.util.Scanner;

public class test {
    static String tervitus(int kord) {
        int kd = 1;
        while (kord >= kd) {
            System.out.println("Võõrustaja: Tere!");
            System.out.println("Täna " + kd + ". kord tervitada, mõtiskleb võõrustaja.");
            System.out.println("Külaline: Tere, suur tänu kutse eest!");
            kd++;
            return
        }
    }

    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage külaliste arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int kord = sisend.nextInt();
        System.out.println(tervitus(kord));
    }
}