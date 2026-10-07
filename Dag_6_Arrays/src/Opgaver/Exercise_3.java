package Opgaver;

import java.util.Arrays;

public class Exercise_3 {
    /*To the ArrayTest class, add a method
        public static int[] sumArrays(int[] a, int[] b)
    that takes two arrays of the same length as parameters, and returns a new array with the same length as a and b.
    The returned array must contain the sum of the values in a and b.
    If a = {4,6,7,2,3} and b = {4,6,8,2,6}, the method should return {8,12,15,4,9}.
    Make another method that works for arrays of unequal lengths (the result array must have the length of the longest array).*/
    public static void main(String[] args) {
        int[] a = {4, 6, 7, 2, 3};
        int[] b = {4, 6, 8, 2, 6};
        int[] c = {4, 6, 8, 2, 6, 51};
        int[] d = {4, 6, 8, 2, 6, 51, 124, 1};

        System.out.println(Arrays.toString(sumArray(a, b)));
        System.out.println(Arrays.toString(sumArraysUnequal(c, d)));
        System.out.println(Arrays.toString(sumArraysUnequal1(c, d)));

    }

    public static int[] sumArray(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            a[i] += b[i];
        }
        return a;
    }

    public static int[] sumArraysUnequal(int[] c, int[] d) {
        int maxArray = Math.max(c.length, d.length);
        int[] arrayUnequal = new int[maxArray];

        for (int i = 0; i < maxArray; i++) {
            // Check for c[i]
            int cValue = 0;  // default to 0
            if (i < c.length) {
                cValue = c[i];  // only assign if within bounds
            }
            // Check for d[i]
            int dValue = 0;  // default to 0
            if (i < d.length) {
                dValue = d[i];  // only assign if within bounds
            }
            // Add the values from both arrays
            arrayUnequal[i] = cValue + dValue;
        }
        return arrayUnequal;
    }
    //Make another method that works for arrays of unequal lengths
    //(the result array must have the length of the longest array).
    //VIRKER IKKE
    public static int[] sumArraysUnequal1(int[] c, int[] d) {
        //Since the resulting array needs to be the same length as the longest array (a or b)
        //you can determine its size like this:
        int maxArray = Math.max(c.length, d.length);
        int[] arrayUnequal = new int[maxArray];

        for (int i = 0; i < maxArray; i++) {
            if (i >= c.length) {
                c[i] = 0;
            }
            if (i >= d.length) {
                d[i] = 0;
            }
            arrayUnequal[i] = c[i] + d[i];
        }
        return arrayUnequal;
    }
}

