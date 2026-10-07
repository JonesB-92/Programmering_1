package Exercise_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Create an ArrayList that contains objects of type String.
        ArrayList<String> names = new ArrayList<>();
        //2. Add strings to the list (in the given order):
        names.add("Hans");
        names.add("Viggo");
        names.add("Jens");
        names.add("Bente");
        names.add("Bent");
        //3. Print the size of the list.
        System.out.println(names.size()); //size = 5

        //4. Add ”Jane” at index 2 in the list.
        names.add(2, "Jane");

        //5. Print the elements in the list.
        System.out.println(names);

        //6. Remove the element at index 1.
        names.remove(1);
        System.out.println(names);

        //7. Add ”Pia” at the front of the list.
        names.addFirst("Pia");
        System.out.println(names);

        //8. Add ”Ib” at the rear of the list.
        names.addLast("Ib");
        System.out.println(names);

        //9. Print the size of the list.
        System.out.println("7) " + names.size());

        //10. Replace the element at index 2 with ”Hansi”.
        names.set(2, "Hansi");
        System.out.println(names);

        //11. Print the size of the list.
        System.out.println("11) " + names.size());

        //12. Print the elements in the list.
        System.out.println("12) " + names);

        //13. Traverse the list with a for statement and print the length of each element in the list.
        System.out.println("13) ");
        for (int i = 0; i < names.size() - 1; i++) {
            System.out.println(i + "-" + " " + names.get(i) + " er på " + names.get(i).length() + " bogstaver.");
        }

        //14. Traverse the list with a for-each statement and print the length of each element in the list.
        System.out.println("14) ");
        int i = 0;
        for (String name : names) { //(Læs: for each "name" in "names")
            System.out.println(i + "- " + name + " er på " + name.length() + " bogstaver.");
            i++;
        }
    }
}
