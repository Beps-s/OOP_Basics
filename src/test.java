/*
 * autor - Chris Erman
 * ülesanne 2.3c
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajal sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage inimeste arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int inimesed = sisend.nextInt();
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage kohtade arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int kohad = sisend.nextInt();
        // arvutame
        int bussid = inimesed / kohad;
        // leiame jäägi
        int jaak = inimesed % kohad;
        if (jaak > 0) {
            bussid = (int) bussid + 1;
        }
        if (jaak > 0) {
        } else {
            jaak = kohad;
        }
        System.out.println("Busse vaja: " + bussid);
        System.out.println("Viimases bussis inimesi: " + jaak);
    }
}