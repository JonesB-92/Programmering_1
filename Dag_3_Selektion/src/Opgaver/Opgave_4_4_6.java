package Opgaver;

import java.util.Scanner;

public class Opgave_4_4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");

        String line = input.nextLine();

        char character = line.charAt(0);

        System.out.println("The character entered is " + character);
    }
}
