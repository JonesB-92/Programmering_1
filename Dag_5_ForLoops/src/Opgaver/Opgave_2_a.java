package Opgaver;

import java.util.Scanner;

public class Opgave_2_a {
    /* Indlæs et tal, som angiver, hvor mange GANGE et antal heltal mellem 1-99 skal indtastest.

    a) Lav et program, der indlæser tallene og udskriver det største tal, det mindste
    tal, antal lige tal og antal ulige tal. */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Typer a number.");

        int amountOfLoops = scanner.nextInt();
        if (amountOfLoops < 1) {
            System.out.println("Number must be greater than 0. Try again");
            amountOfLoops = scanner.nextInt();
        }

        System.out.println("You may enter " + amountOfLoops + " numbers between 1 and 99.");

        int[] numbers = new int[amountOfLoops];
        int count = 0;
        while (count <= amountOfLoops - 1) {
            System.out.println(count + 1 + ". number: ");
            int inputNum = scanner.nextInt();
            numbers[count] = inputNum;
            count++;
        }

        printStats(numbers);
    }


    public static void printStats(int[] nums) {

        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        int amountEven = 0;
        int amountOdd = 0;

        for (int i = 0; i < nums.length; i++) {
            //Laveste
            if (nums[i] < lowest) {
                lowest = nums[i];
            }
            if (nums[i] > highest) {
                highest = nums[i];
            }
            if (nums[i] % 2 == 0) {
                amountEven++;
            } else amountOdd++;
        }

        System.out.println("Lowest: " + lowest);
        System.out.println("Highest: " + highest);
        System.out.println("AmountEven: " + amountEven);
        System.out.println("AmountOdd: " + amountOdd);
    }
}
