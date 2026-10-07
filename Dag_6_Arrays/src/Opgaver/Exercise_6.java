package Opgaver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise_6 {
/*Make an Ex7Test class with a main() method and add the following methods to the class (they
all take an int array as parameter):
• A method that switches the first and last element in the array.
• A method that replaces all even numbers with 0 (zero).
• A method that returns the second-highest element in the array.
• A method that returns true if the elements in the array are sorted ascending.
• A method that shifts all elements in the array to the right (to an index one higher). The
last element is shifted to the first index in the array.
Example: {1, 4, 9, 16, 25} is changed to {25, 1, 4, 9, 16}
• A method that returns true if the array has doublets.
Example: true is returned for {2, 5, 8, 5}, false is returned for {2, 5, 8, 6}.
Test your methods in main().*/

    public static void main(String[] args) {
        int[] test = {1, 4, 5, 6, 3, 4, 8};
        int[] test0 = {1, 4, 5, 6, 3, 4, 8};
        int[] test1 = {1, 4, 5, 6, 3, 4, 8};
        int[] test2 = {1, 4, 5, 6, 3, 4, 8, 242, 21, 244};
        int[] test3 = {1, 2, 3, 4, 5};
        int[] test4 = {1, 4, 9, 16, 25};

        System.out.println("Switch first and last");
        System.out.println(Arrays.toString(switchFirstAndLast(test)));
        System.out.println("Replace even numbers");
        System.out.println(Arrays.toString(replaceEvenNumbers(test0)));
        System.out.println("Return second highest");
        System.out.println((secondHighest(test1)));
        System.out.println(secondHighest(test2));
        System.out.println(secondHighest(test3));
        System.out.println("Is array ascending or nah");
        System.out.println(isAscending(test));
        System.out.println(isAscending(test3));
        System.out.println("Shift index to the right");
        System.out.println(Arrays.toString(shiftToTheRight(test4)));
        System.out.println("Does array contain doublets?");
        System.out.println(hasDoublets(test4));
        System.out.println(hasDoublets(test1));
        System.out.println(hasDoublets(test));
    }

    //A method that switches the first and last element in the array.
    /*Since the method works on an array, it should take an array as a parameter
    (otherwise, how will it know which array to switch?).*/
    public static int[] switchFirstAndLast(int[] array) {
        int first = array[0];
        int last = array[array.length - 1];

        array[0] = last;
        array[array.length - 1] = first;

        return array;
    }

    //A method that replaces all even numbers with 0 (zero).
    public static int[] replaceEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    //A method that returns the second-highest element in the array.
    public static int secondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            }
            if (array[i] < highest && array[i] > secondHighest) {
                secondHighest = array[i];
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondHighest;
    }

    //A method that returns true if the elements in the array are sorted ascending
    public static boolean isAscending(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /*A method that shifts all elements in the array to the right (to an index one higher). The last element is shifted
    to the first index in the array.
    Example: {1, 4, 9, 16, 25} is changed to {25, 1, 4, 9, 16}*/
    public static int[] shiftToTheRight(int[] array) {
        int lastIndex = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastIndex;
        return array;
    }

    //This does shift elements, but it actually shifts them to the left, not the right!!!!!!!!!!
    public static int[] shiftToTheRight1(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (i == 0) {
                array[i] = array[0];
            }
            array[i] = array[i + 1];
        }
        array[0] = array[array.length - 1];
        return array;
    }


    //A method that returns true if the array has doublets.
    //Example: true is returned for {2, 5, 8, 5}, false is returned for {2, 5, 8, 6}.
    public static boolean hasDoublets(int[] array) {
        boolean hasDoublets = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }

            }
        }
            return hasDoublets;
    }
}
