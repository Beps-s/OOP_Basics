/*
 * autor - Chris Erman
 * ülesanne 2.3c
 * while tsükkel
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage mitu korda tuleb äratada: ");
        // salvestame kasutaja sisestatud väärtuse
        int aratamine = sisend.nextInt();
        // korduv tegevus
        int kord = 1;
        while (kord <= aratamine) {
            System.out.println("Tõuse ja sära!");
            kord++;
        }
    }
}