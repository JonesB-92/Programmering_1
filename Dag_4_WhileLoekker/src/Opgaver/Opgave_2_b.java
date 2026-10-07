package Opgaver;

import java.util.Scanner;

public class Opgave_2_b {
/* Lav en klasse med en main() metode. Tilføj til klassen en metode sumEvenInts(int lower, int upper), der
returnerer summen af alle lige tal mellem lower og upper. Grænserne lower og upper skal indlæses.
Kald metoden i main() metoden. (Resultatet af sumEvenInts(7, 25) er 144.) */

    public static void main(String[] args) {

        System.out.println("Indsæt to tal");

        //lower og upper skal indlæses = scanner
        Scanner scanner = new Scanner(System.in);
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

        System.out.println(sumEvenInts(lower, upper));
    }


    public static int sumEvenInts(int lower, int upper) {

        //Metode sumEven skal returnere sum af alle LIGE tal mellem lower og upper
        int sum = 0;
        int i = lower;

        while (i <= upper) {
            if (i % 2 != 0) {
                i++;
            }
            sum += i;
            i += 2;
        }
        return sum;
    }
}
