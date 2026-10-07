package Exercise_1;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {0, 2, 5, 56, 7, 8, 9, 5, 43, 2, 4125, 5};
        int[] array1 = {0, 2, 4, 56, 8, 4, 2, 4124, 10};
        int[] array2 = {7, 56, 34, 3, 7, 14, 13, 4};
        int[] array3 = {7, 9, 13, 7, 9, 13};
        int[] array4 = {7, 9, 13, 13, 9, 7};
        int[] array5 = {7, 9, 13, 13, 13, 13, 9, 7};

        System.out.println(containsUnevenForLoop(array));
        System.out.println(containsUnevenForLoop(array1));
        System.out.println("WHILE loop");
        System.out.println(containsUnevenWhile(array));
        System.out.println(containsUnevenWhile(array1));
        System.out.println("-------------- Exercise 2-----------------");
        System.out.println(firstNumberInterval(array2));
        System.out.println(firstNumberIntervalCorrect(array2));
        System.out.println("-------------- Exercise 3 ----------------");
        System.out.println(adjacentNumsSame(array3));
        System.out.println(adjacentNumsSame(array4));
        System.out.println(numsSame(array5, 3));
        System.out.println(numsSame(array5, 4));
        int[] arr = {1, 1, 2, 3, 3, 4, 5, 5};
        System.out.println(numsSame(arr, 3));


        System.out.println("------------ Exercise 4 --------------------");
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob"); //1
        names.add("Charlie");
        names.add("Diana");
        names.add("Eve");
        names.add("Frank");
        names.add("Grace");
        names.add("Hannah");
        names.add("Bob");    //8 - duplicate name
        names.add("Ivy");
        System.out.println(findAllIndices(names, "bob"));
        System.out.println(findAllIndices(names, "boB"));
        System.out.println(findAllIndices(names, "BoB"));

        System.out.println("-------------- Exercise 5 ----------------------");
        System.out.println(repeatedChars("vnhstxxxaby", 3));
        System.out.println(repeatedChars("vnhstxxxaby", 4));
    }

    //Exercise 1
    //Write a linear search method that returns, whether an uneven number exists in an array. The
    //method must return true or false, and take an array of integer numbers as parameter.
    //Test the method.
    public static boolean containsUnevenForLoop(int[] arr) {
        boolean hasUneven = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                hasUneven = true;
                break; //Breaker for at stoppe loopet så snart, vi har fundet target. Derfor man normalt ville bruge While loop
            }
        }
        return hasUneven;
    }

    public static boolean containsUnevenWhile(int[] arr) {
        int i = 0;
        boolean hasUneven = false;

        while (!hasUneven && i < arr.length) {
//            int k = arr[i];
            if (arr[i] % 2 != 0) {
                hasUneven = true;
            } else i++;
        }
        return hasUneven;
    }

    //Exercise 2
    //Write a linear search method that finds the first number belonging to the interval [10;15]. The
    //method must return the number found in the interval, and take an array of integer numbers as
    //parameter. If a number in the interval is not found, the method must return -1.
    //If the array is [7, 56, 34, 3, 7, 14, 13, 4], the method should return 14'
    public static int firstNumberInterval(int[] arr) {
        int numberTenFifteen = -1;

        int i = 0;
        while (numberTenFifteen == -1 && i < arr.length) {
            int[] k = {10, 11, 12, 13, 14, 15};
            for (int j = 0; j < k.length; j++) {
                if (arr[i] == k[j]) {
                    numberTenFifteen = arr[i];
                }
            }
            i++;
        }
        return numberTenFifteen;
    }

    public static int firstNumberIntervalCorrect(int[] arr) {
        int numberTenFifteen = -1;

        int i = 0;
        while (numberTenFifteen == -1 && i < arr.length) {
            if (arr[i] >= 10 && arr[i] <= 15) {
                numberTenFifteen = arr[i];
            } else i++;
        }
        return numberTenFifteen;
    }

    //---------------------------------------------
    //Exercise 3
    //Write a linear search method that returns true, if two adjacent numbers are the same. The
    //method must take an array of integer numbers as parameter.
    //Test the method.
    //If the array is [7, 9, 13, 7, 9, 13], the method must return false. If the array is [7, 9, 13, 13, 9,
    //7], the method must returns true.
    public static boolean adjacentNumsSame(int[] arr) {
        boolean isSame = false;

        int nextNums = 0;
        int i = 0;
        while (!isSame && i < arr.length - 1) {
            nextNums = arr[i + 1];
            if (arr[i] == nextNums) {
                isSame = true;
            } else i++;
        }
        return isSame;
    }

    //Write another method that returns true, if the same number exists in n adjacent places. The
    //method must take an array of integer numbers and the number n as parameters.
    public static boolean numsSame(int[] arr, int n) {
        boolean isSame = false;

        if (arr.length < n) {
            return false;
        }

        int sameNums = 1;

        int i = 0;
        while (!isSame && i < arr.length - 1) {
            if (arr[i] == arr[i + 1]) {
                sameNums++;
                if (sameNums == n) {
                    isSame = true;
                }
            } else {
                sameNums = 1;
            }
            i++;
        }
        return isSame;
    }

    //Exercise 4
    //Write a method that returns all indices of a given String in a given ArrayList<String>.
    //The header of the method:
    public static ArrayList<Integer> findAllIndices(ArrayList<String> list, String target) {
        ArrayList<Integer> stringIndices = new ArrayList<>();

        int i = 0;
        for (String string : list) {
            if (string.equalsIgnoreCase(target)) {
                stringIndices.add(i);
            }
            i++;
        }
        return stringIndices;
    }

    //Exercise 5 *
    //Write a search method, named repeatedChars(), with two parameters: a string s, and a positive
    //int k.
    //The method must return a boolean indicating whether the same character is found in k
    //adjacent positions in the string. This is an advanced searching.
    public static boolean repeatedChars(String s, int k) {
        boolean isRepeated = false;

        if (k < 0) {
            System.out.println("\nint k must be a positive number.");
            return false;
        }

        int sameNums = 1;
        int i = 0;
        while (!isRepeated && i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                sameNums++;
            } else {
                sameNums = 1;
            }
            if (sameNums == k) {
                isRepeated = true;
            }
            i++;
        }

        return isRepeated;
    }

//Examples:
//repeatedChars("vnhstxxxaby",3) returns true, because the character x is found in 3 adjacent
//places in the string.
//repeatedChars("vnhstxxxaby",4) returns false.
}


