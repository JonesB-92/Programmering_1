package Eksempler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class PrintWriterTal {

    public static void main(String[] args) {
        try {
            String fileName = "C:\\PRO1_24Y\\Programmering1\\Dag25_Exceptions\\txt\\tal.txt";
            PrintWriter printWriter = new PrintWriter(fileName);

            // Indtast antal tal i filen
            Scanner scan = new Scanner(System.in);
            System.out.print("Antal tal der skal skrives i filen: ");
            int antal = scan.nextInt();

            // Generer og skriv de tilfældige tal i filen
            Random rnd = new Random();
            for (int n = 1; n <= antal; n++) {
                int tal = rnd.nextInt(10000);
                printWriter.println(tal);
            }

            // Flush og skriv filen
            printWriter.flush();
            printWriter.close();
            scan.close();
            System.out.println("Filen er lavet");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
