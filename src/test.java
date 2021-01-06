/*
 * autor - Chris Erman
 * ülesanne 3.3
 * while tsükkel
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage mitu täringut veeretatakse: ");
        // salvestame kasutaja sisestatud väärtuse
        int korrad = sisend.nextInt();
        // korduv tegevus
        while (true) {
            int taring = (int) Math.round(Math.random() * 6);
            System.out.println(taring);
            if (taring == korrad) {
                break;
            }
        }
    }
}