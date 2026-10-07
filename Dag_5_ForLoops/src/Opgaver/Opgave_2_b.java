package Opgaver;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Opgave_2_b {

    /* Indlæs et tal, som angiver, hvor mange GANGE et antal heltal mellem 1-99 skal indtastes.

    b) Lav et program, der indlæser tallene og udskriver den løbende sum.
    Indtastes 1 7 2 9, skal programmet udskrive 1 8 10 19.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number between 1 and 99.");

        int amountOfLoops = scanner.nextInt();
        while (amountOfLoops < 1 || amountOfLoops > 99) {
            System.out.print("Try again. ");
            amountOfLoops = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < amountOfLoops; i++) {
            System.out.println("Type " + (amountOfLoops - i) + " more numbers.");
            System.out.print("i = " + i + " - ");
            System.out.println("sum = " + sum + " ");
            int number = scanner.nextInt();

            sum += number;
        }
    }
}


