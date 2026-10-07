package Exercise_2;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);

        //ints.addAll(List.of(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum1() method: correct sum is 61.
        int total = sumForLoop(ints);
        System.out.println("Sum: " + total);

        // Test of sum() method: correct sum is 61.
        System.out.println("\nSum of sum() =");
        System.out.println(sumForEach(ints));
        System.out.println(sumForEach(new ArrayList<>())); //Returnerer 0 med tom liste

        // Test of minimum() method: correct minimum is -16.
        System.out.println("\nMinimum element in the list (" + ints + ")");
        System.out.println(minimum(ints));

        // Test of maximum() method: correct maximum is 45.
        System.out.println("\nMaximum element in the list (" + ints + ")");
        System.out.println(maximum(ints));

        // Test of average() method: correct average is 7.625.
        System.out.println("\nThe average of of all the numbers in the list is ");
        System.out.println(average(ints));

        // Test of zeroes() method: correct number of zeroes is 2.
        System.out.println("\nAmount of zeroes");
        System.out.println(amountOfZeroes(ints));

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        System.out.println("\nArray of even numbers");
        System.out.println(evenNumbers(ints));
    }

    // sum made with for loop
    public static int sumForLoop(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            sum += number;
        }
        return sum;
    }

    /**
     * Return the sum of all numbers in the list.
     * Return 0, if the list is empty.
     */
    public static int sumForEach(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;

        } else {
            int sum = 0;
            for (Integer number : list) {
                sum += number;
            }
            /* SAMME SOM
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                int number = list.get(i);
                sum += number;
            }*/
            return sum;
        }
    }

    //* Return the minimum of all numbers in the list.
    //* Pre: The list is not empty.
    public static int minimum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else return Collections.min(list);
    }

    public static int maximum(ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            return Collections.max(list);
        } else return 0;
    }

    //* Return the average of the numbers in the list.
    //* Pre: The list is not empty.
    public static double average(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else return (double) sumForEach(list) / list.size();

    }

    /**
     * Return the number of zeroes in the list
     */
    public static int amountOfZeroes(ArrayList<Integer> list) {
        int amountOfZeroes = 0;

        if (list.isEmpty()) return 0;
        else {
            for (Integer number : list) {
                if (number == 0) {
                    amountOfZeroes++;
                }
            }
        }
        return amountOfZeroes;
    }

    /**
     * Return a new list containing the even numbers in the list.
     */
    public static ArrayList<Integer> evenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        if (list.isEmpty()) return null;
        else {
            for (Integer number : list) {
                if (number % 2 == 0) {
                    newArrayList.add(number);
                }
            }
        }
        return newArrayList;
    }
}





