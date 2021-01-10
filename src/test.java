/*
 * autor - Chris Erman
 * ülesanne 6.2
 * meetod + return
 * */

import java.util.Scanner;

public class test {
    static int mahlapakideArv(double ounteKogus) {
        int pakideArv = (int) Math.round(ounteKogus * 0.4 / 3);
        return pakideArv;
    }

    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage õune kogus kilogrammides: ");
        // salvestame kasutaja sisestatud väärtuse
        double ounteKogus = sisend.nextDouble();
        System.out.println(mahlapakideArv(ounteKogus));
    }
}