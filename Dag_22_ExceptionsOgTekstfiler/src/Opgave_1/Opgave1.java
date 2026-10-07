package Opgave_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Opgave1 {
    /**
     * a) Undersøg hvilke exceptions, der kan blive kastet.
     */
    /* "ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10"
    "InputMismatchException" */
    public static void main(String[] args) {

        int[] prim = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("\nHvilket nr. primtal skal vises?: ");
            int n = scan.nextInt();

            System.out.println("Primtal nr. " + n + " er "
                    + prim[n - 1] + "\n");
        }// b) Udvid koden, så de exceptions, der kan opstå, fanges og håndteres.
        catch (InputMismatchException mismatchException) {
            System.out.println(".getMessage: " + mismatchException.getMessage() + "\n.toString: " + mismatchException.toString() +
                    "\n" + mismatchException + //toString er overflødigt!
                    "\n Tallet skal være et heltal.");
        } catch (ArrayIndexOutOfBoundsException arrayEx) {
            System.out.println(".getMessage: " + arrayEx.getMessage() + "\n.toString: " + arrayEx.toString() + "\n" +
                    arrayEx + //toString er overflødigt!
                    "\n Et tal mellem 1 og 10, please");
        } catch (Exception e) {
            System.out.println("Der skete en uventet fejl.");
        }
    }
}

