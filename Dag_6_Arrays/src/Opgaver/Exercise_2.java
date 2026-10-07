package Opgaver;


public class Exercise_2 {
    /* Create a class named ArrayTest with a main() method.
    To the ArrayTest class, add a method
        public static int sum(int[] t)
    that returns the sum of the numbers in the array. If t = {4,6,7,2,3}, the method should return 22.
    Test your method in main().
    Implement a similar method using an array of doubles. */

    public static void main(String[] args) {
        int[] t = {4, 6, 7, 2, 3};
        int[] s = {15, 4, 214, 124251241, 214, 123};
        double[] s1 = {15.4, 21.4, 12425.1241, 2.14, 12.3};

        System.out.println(sumOfArray(t));
        System.out.println(sumOfArray(s));
        System.out.println(sumOfArrayDouble(s1));
    }
    public static int sumOfArray(int[] t) {
        //returns the sum of the numbers in the array. If t = {4,6,7,2,3}, the method should return 22.
        int sum = 0;

        for (int i = 0; i < t.length; i++)
            sum += t[i];

        return sum;
    }

    //Implement a similar method using an array of doubles.
    public static double sumOfArrayDouble(double[] t) {
        double sum = 0;

        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }

        return sum;
        }
}




