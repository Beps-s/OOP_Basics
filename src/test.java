/*
 * autor - Chris Erman
 * ülesanne 5.1
 * Massiivid
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] vastuvoetud = {2803, 2626, 2359, 1927, 2236, 2281, 2394, 2484, 2468};
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage aasta: ");
        int aasta = sisend.nextInt();
        int index = aasta - 2011;
        System.out.println(aasta + ". aastal on vastuvõetud " + vastuvoetud[index]);
    }
}