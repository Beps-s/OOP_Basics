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
        System.out.println("Sisestage mitu ringi joosti: ");
        // salvestame kasutaja sisestatud väärtuse
        int korrad = sisend.nextInt();
        // korduv tegevus
        int ring = 1;
        int porgandid = 0;
        while (ring <= korrad) {
            if (ring % 2 == 0) {
                porgandid = porgandid + ring;
            }
            ring++;
        }
        System.out.println("porgandite koguarv on: " + porgandid);
    }
}