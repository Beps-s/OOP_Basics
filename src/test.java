/*
 * autor - Chris Erman
 * ülesanne 5.4a
 * Massiivid
 * */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<String> opilased = new ArrayList<>();
        File fail = new File("C:\\Users\\chris\\IdeaProjects\\oop_alused\\src\\nimekiri.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            opilased.add(rida);
        }
        sisendFailist.close();

        for (int i = 0; i < opilased.size(); i++) {
            System.out.println(i opilased.get(i));
        }
    }
}