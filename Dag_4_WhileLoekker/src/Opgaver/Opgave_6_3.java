package Opgaver;

import javax.xml.transform.Result;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Opgave_6_3 {
/* (Palindrome integer) Write the methods with the following headers:
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome */

    public static void main(String[] args) {
        /* Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert an int.");
        int number = scanner.nextInt();

        System.out.println(reverse(number));
        System.out.println(isPalindrome(number));


    }

    // Return the reversal of an integer, e.g., reverse(456) returns 654
    public static int reverse(int originalNumber) {
        int ciffer;
        int result = 0;
        while (originalNumber != 0) {
            ciffer = originalNumber % 10; //her får vi sidste ciffer (hvis result = 756 bliver ciffer 6)

            result = result * 10 + ciffer; //resultat bliver her "result = result * 10 + 6 (sidste ciffer)" = 6

            originalNumber /= 10;
        }

        return result;

    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int originalNumber) {
        String resultat = "The number is a palindrome!";

        if (originalNumber == reverse(originalNumber)) {
            System.out.println(resultat);
            return true;

        } else System.out.println("The number isn't a palindrome.");
        return false;

    }


}


