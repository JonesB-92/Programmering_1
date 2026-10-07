package Opgaver;

import java.util.ArrayList;
import java.util.Collections;

public class Opgave_4 {
    //Opgave 4
    //I klassen java.util.Collections findes en static metode sort, der kan anvendes til at sortere en
    //ArrayList af Comparable objekter. En anvendelse af metoden ser ud som følger:

    public static void main(String[] args) {
    //Prøv at udføre ovenstående program - bliver listen sorteret? Hvad er det der gør det muligt for
    //sort-metoden at sortere listen?
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jan");
        list.add("Bent");
        list.add("Thomas");
        list.add("Karsten");
        list.add("Dan");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

