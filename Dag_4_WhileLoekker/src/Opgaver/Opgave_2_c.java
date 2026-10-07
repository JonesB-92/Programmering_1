package Opgaver;

import java.util.Scanner;

public class Opgave_2_c {
/*Lav en klasse med en main() metode. Tilføj til klassen en metode sumOddDigits(int number), der returnerer
summen af de ulige cifre i tallet number. Tallet number skal indlæses. Kald metoden i main() metoden.
(Resultatet af sumOddDigits(1.234.567) er 16.) */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int result = sumOddDigits(input);
        System.out.println(result);

    }

    public static int sumOddDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int ciffer = number % 10;

            if (ciffer % 2 != 0) {
                sum += ciffer;

            }
            number = number / 10;

        }
        return sum;
    }
}
