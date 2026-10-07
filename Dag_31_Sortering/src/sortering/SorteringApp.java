package sortering;

import java.util.Arrays;

public class SorteringApp {

    public static void main(String[] args) {
        final int[] tabelInit = { 34, 12, 56, 12, 45, 89, 2 };

        System.out.println("Bubbelsortering");
        int[] tabel = Arrays.copyOf(tabelInit, tabelInit.length);
        System.out.println(Arrays.toString(tabel));
        BubbelSortering.bubbleSort(tabel);
        System.out.println(Arrays.toString(tabel));

        System.out.println("--------------------------------");

        System.out.println("Insertionsortering");
        tabel = Arrays.copyOf(tabelInit, tabelInit.length);
        System.out.println(Arrays.toString(tabel));
        SelectionSort.selectionSort(tabel);
        System.out.println(Arrays.toString(tabel));

        System.out.println("--------------------------------");

        System.out.println("Selectionsortering");
        tabel = Arrays.copyOf(tabelInit, tabelInit.length);
        System.out.println(Arrays.toString(tabel));
        InsertionSortering.insertionSort(tabel);
        System.out.println(Arrays.toString(tabel));

    }

}
