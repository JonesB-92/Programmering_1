package Opgaver;

import java.util.Arrays;

public class Opgave_1 {

    public static void main(String[] args) {
        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian", "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        //Med udgangspunkt i bubble sort, skriv en BobleSorterings-metode der kan sortere et array af
        //String-objekter
        bubbleSort(s);

        System.out.println(Arrays.toString(s));

    }

    public static void bubbleSort(String[] names) {
        for (int i = names.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) >= 0) {
                    swap(names, j, j + 1);
                }
            }
        }
    }

    private static void swap(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

}
