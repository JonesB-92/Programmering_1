package Opgaver;

import java.util.Scanner;

public class Opgave_1_b {
/* b) Lav en klasse med en main metode(). Programmer i main() metoden en while-løkke, som summerer alle
kvadrattal mellem 1 og tallet limit, hvor limit er indlæst.
(Bemærk, at kvadratet skal være <= limit. Hvis limit=100, er resultatet 385 */

    public static void main(String[] args) {
        //Erklærer kvadrattal
        int kvadratTal = 1;
        int sum = 0;

        //Erklærer limit, som skal hentes udefra
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        while (kvadratTal * kvadratTal <= limit) {
            sum += kvadratTal * kvadratTal;
            kvadratTal++;

            System.out.print(" " + kvadratTal + " ");
            System.out.print(" " + kvadratTal * kvadratTal + " ");
            System.out.println(sum);
        }

    }

}
