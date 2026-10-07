package Opgaver;

import java.util.Scanner;

public class Opgave_2_c {
    /* Indlæs et tal, som angiver, hvor mange GANGE et antal heltal mellem 1-99 skal indtastes.

    c) Lav et program, der indlæser tallene og udskriver det største tal og hvor mange
    gange det forekommer. Indtastes 3 5 2 5 4 5 5 er det største tal 5 og det forekommer 4 gange.
    (Hint: Brug to variable: max til det største tal og count til antal forekomster.) */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number between 1 and 99.");

        int amountOfLoops = scanner.nextInt();

        while (amountOfLoops < 1 || amountOfLoops >= 99) {
            System.out.print("Try again. ");
            amountOfLoops = scanner.nextInt();
        }

        int max = 0;
        int count = 0;
        for (int i = 0; i < amountOfLoops; i++) {
            System.out.println("Type " + (amountOfLoops - i) + " numbers more.");

            int number = scanner.nextInt();
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }
        System.out.println("The highest number was " + max + " and it was typed " + count + " of times.");
    }
}
