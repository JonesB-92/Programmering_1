package Opgave_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Opgave3 {
    //Læs filen fra opgave 2) og indsæt tallene i en ArrayList<Integer> efterhånden som de indlæses.
    //Udskriv dernæst tallene fra arraylisten i omvendt rækkefølge, dvs. 285, 177, …, 34

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\j0int\\Desktop\\TalOpg3.txt");
            Scanner fileInput = new Scanner(file);

            ArrayList<Integer> intArray = new ArrayList<>();

            while (fileInput.hasNext()) {
                int number = Integer.parseInt(fileInput.nextLine());
                intArray.add(number);
            }

            for (int i = intArray.size() -1; i >= 0; i--) {
                System.out.println(intArray.get(i));
            }

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
