/*
 * autor - Chris Erman
 * ülesanne 5.3
 * Massiivid
 * */


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Double> tehingud = new ArrayList<>();
        File fail = new File("C:\\Users\\chris\\IdeaProjects\\oop_alused\\src\\konto.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        while (sisendFailist.hasNextLine()) {
            Double rida = sisendFailist.nextDouble();
            tehingud.add(rida);
        }
        sisendFailist.close();
        for (int i = 0; i < tehingud.size(); i++) {
            if (tehingud.get(i) >= 0) {
                System.out.println(tehingud.get(i));
            }
        }
    }
}