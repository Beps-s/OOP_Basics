/*
 * autor - Chris Erman
 * ülesanne 5.4c
 * Massiivid
 * */


import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

        LocalDateTime tananeKuupaev = LocalDateTime.now();
        System.out.println("Tänane kuupäev ilma vorminduseta " + tananeKuupaev);
        DateTimeFormatter kuupaevaVormindus = DateTimeFormatter.ofPattern("dd");
        String tananeKuupaevVormindatud = tananeKuupaev.format(kuupaevaVormindus);
        System.out.println("Tänane vormindatud kuupäev " + tananeKuupaevVormindatud);
        int indeks = Integer.parseInt(tananeKuupaevVormindatud);
        System.out.println(opilased.get(indeks - 1));
    }
}