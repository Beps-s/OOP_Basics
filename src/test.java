/*
 * autor - Chris Erman
 * ülesanne 6.3
 * meetod + return
 * */

import java.util.Scanner;

public class test {
    static int eelarve(int inimesed) {
        int eelarve = 10 * inimesed + 55;
        return eelarve;
    }

    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage kutsutud inimeste arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int kutsutud = sisend.nextInt();
        System.out.println("Sisestage inimeste arv, kes on teatanud, et tulevad: ");
        int teatanud = sisend.nextInt();
        System.out.println("Maksimaalne eelarve: " + eelarve(kutsutud));
        System.out.println("Minimaalne eelarve: " + eelarve(teatanud));
    }
}