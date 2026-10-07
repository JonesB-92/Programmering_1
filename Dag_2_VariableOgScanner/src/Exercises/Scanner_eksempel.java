package Exercises;

import java.util.Scanner;

public class Scanner_eksempel {
    public static void main(String[] args) {

       Scanner scanner1 = new Scanner(System.in);

        System.out.println("Indtast et tal mellem 0 og 1000");

        int number = scanner1.nextInt();

        System.out.print("Du tastede tallet " + number);

    }

}
