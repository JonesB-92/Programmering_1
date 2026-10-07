package Opgaver;

import java.util.Arrays;

public class Exercise_1 {

    /*Create a class with a main() method. Add code to the main() method to fill 8 arrays with the
    following values:
    a. 0 0 0 0 0 0 0 0 0 0
    b. 2 44 -23 99 8 -5 7 10 20 30
    c. 0 1 2 3 4 5 6 7 8 9
    d. 2 4 6 8 10 12 14 16 18 20
    e. 1 4 9 16 25 36 49 64 81 100
    f. 0 1 0 1 0 1 0 1 0 1
    g. 0 1 2 3 4 0 1 2 3 4
    h. 0 3 4 7 8 11 12 15 16 19
    Use a for loop in c) - h) to fill the array. (To print an array, use Arrays.toString()) */

    public static void main(String[] args) {
        //a. 0 0 0 0 0 0 0 0 0 0
        int[] numbers = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] numbers2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] numbers3 = new int[10];
        System.out.println("Opgave a");
        System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.toString(numbers2));
        //System.out.println(Arrays.toString(numbers3));

        //b. 2 44 -23 99 8 -5 7 10 20 30
        int[] rowsb = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};
        System.out.println("Opgave B");
        System.out.println(Arrays.toString(rowsb));

        //c. 0 1 2 3 4 5 6 7 8 9
        int[] rowsC = new int[10];
        for (int i = 0; i < 10; i++) {
            rowsC[i] = i;
        }
        System.out.println("Opgave C");
        System.out.println(Arrays.toString(rowsC));

        //d. 2 4 6 8 10 12 14 16 18 20
        int[] rowsD = new int[10];

        for (int i = 0; i < rowsD.length; i++) {
            rowsD[i] = (i + 1) * 2;
        }
        System.out.println("Opgave D");
        System.out.println(Arrays.toString(rowsD));

        //e. 1 4 9 16 25 36 49 64 81 100
        // i + odd numbers ELLER kvadrattal!!
        int[] rowsE = new int[10];
        for (int i = 1; i <= rowsE.length; i++) {
            rowsE[i - 1] = i * i;
        }
        System.out.println("Opgave E");
        System.out.println(Arrays.toString(rowsE));

        //ELLER
        for (int i = 0; i < rowsE.length - 1; i++) {
            rowsE[i] = (i + 1) * (i + 1);
        }
        System.out.println("Opgave E.1");
        System.out.println(Arrays.toString(rowsE));

        //f. 0 1 0 1 0 1 0 1 0 1
        int[] rowsF = new int[10];
        for (int i = 0; i < rowsF.length; i++) {
            if ((rowsF[i] = i % 2) == 0) {
                System.out.print("0 ");
            } else System.out.print("1 ");
        }
        System.out.println();

        //Ovenstående fungerer ikke helt: udskriver i princippet ikke nogen array.
        int[] rowsF1 = new int[10];
        for (int i = 0; i < rowsF1.length; i++)
            rowsF1[i] = i % 2;

        System.out.println("Opgave F1");
        System.out.println(Arrays.toString(rowsF1));

        //g. 0 1 2 3 4 0 1 2 3 4
        int[] rowsG = new int[10];
        for (int i = 0; i < 10; i++) {
            rowsG[i] = i % 5;
        }
        System.out.println("Opgave g");
        System.out.println(Arrays.toString(rowsG));

        //ELLER nested loop
        int[] rowsG1 = new int[10];
        int number = 0;

        for (int i = 0; i < rowsG1.length; i++) {
            rowsG1[i] = number; //Lagrer index til number
            number++; //Lægger et tal til number
            if (number == 5) { //Hvis det lagrede tal er 5, start forfra
                number = 0;
            }
        }
        System.out.println("Opgave G1");
        System.out.println(Arrays.toString(rowsG1));

        //h. 0 3 4 7 8 11 12 15 16 19
        int[] rowsH = new int[10];
        int indexTal = 0;
        for (int i = 0; i < rowsH.length; i++) {
            if (i % 2 == 0) {
                rowsH[i] += i * 2;
            } else rowsH[i] = rowsH[i - 1] + 3;
        }
        System.out.println("Opgave H");
        System.out.println(Arrays.toString(rowsH));
    }
}