package Opgaver;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Opgave_2_d {
    /*d) Lav et program, der indlæser tallene og udskriver de tal, som forekommer flere
    gange efter hinanden. Indtastes 1 3 3 4 5 5 5 5 6 6 6 1 3 3, skal programmet udskrive 3 5 6 3. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number between 1 and 99.");

        int amountOfLoops = scanner.nextInt();

        while (amountOfLoops < 1 || amountOfLoops > 99) {
            System.out.print("Try again. ");
            amountOfLoops = scanner.nextInt();
        }
        int sidsteTal = 0;
        String sammeTal = "";

        boolean numberInUse = false;

        for (int i = 0; i < amountOfLoops; i++) {
            System.out.print("Type " + (amountOfLoops - i) + " more numbers.");
            int number = scanner.nextInt();

            if (number == sidsteTal && numberInUse == false) {
                sammeTal += number + " ";
                numberInUse = true;
            } else if(number != sidsteTal){
                numberInUse = false;
            }
            sidsteTal = number;
        }
        System.out.println(sammeTal + " final");
    }
}
