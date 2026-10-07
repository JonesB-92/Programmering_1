package DemoArrayList;

import java.util.ArrayList;

public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // add at the end
        names.add("Ib");
        names.add("Peter");
        names.add("Ulla");
        System.out.print("(1) "); // (1)
        System.out.println(names);
        System.out.println();

        // add at index 1
        names.add(1, "Per");
        System.out.print("(2) "); // (2)
        System.out.println(names);
        System.out.println();

        // read value at index 2
        String name1 = names.get(2);
        System.out.print("(3) "); // (3)
        System.out.println("Name at index 2: " + name1);
        System.out.println();

        // remove value at index 3
        String name2 = names.remove(3);
        System.out.print("(4) "); // (4)
        System.out.println("Removed at index 3: " + name2);
        System.out.println(names);
        System.out.println();

        // replace value at index 0
        String replaced = names.set(0, "Jens");
        System.out.print("(5) "); // (5)
        System.out.println("Replaced at index 0: " + replaced);
        System.out.println(names);
        System.out.println();

        // get index of a value
        System.out.print("(6) "); // (6)
        System.out.println("Index of 'Peter': " + names.indexOf("Peter"));
        System.out.println("Index of 'Mike': " + names.indexOf("Mike"));
        System.out.println();

        // test for contains
        System.out.print("(7) "); // (7)
        System.out.println("Contains 'Per'? " + names.contains("Per"));
        System.out.println("Contains 'Mike'? " + names.contains("Mike"));
        System.out.println();

        // Traversing with for statement
        System.out.print("(8) "); // (8)
        System.out.println("Traversing with for statement:");
        for (int i = 0; i < names.size(); i++) {  // i er 0, 1, 2, 3, ...
            String name = names.get(i);  // name "Ib", "Per", "Jens", ...
            System.out.println(i + ": " + name);
        }
        System.out.println();

        // Traversing with for-each
        System.out.print("(9) "); // (9)
        System.out.println("Traversing with for-each statement:");
        for (String name : names) { // name "Ib", "Per", "Jens", ...
            System.out.println(name);
        }
        System.out.println();

        // ---------------------------------------------------------------------
        System.out.println("-----------");

        // ArrayList can only contain objects, not primitive values.
        // Use wrapper classes for primitive types.

        //ArrayList<int> numbers = new ArrayList<>(); // ERROR: int not allowed
        ArrayList<Integer> numbers = new ArrayList<>(); // OK!

        numbers.add(10); // automatic boxing: 10 -> Integer(10)
        numbers.add(20); // automatic boxing: 20 -> Integer(20)
        System.out.print("(10) "); // (10)
        System.out.println("numbers = " + numbers);

        int x = numbers.get(0); // automatic unboxing: Integer(10) -> 10
        System.out.println("x is " + x);

        if (numbers.get(1) == 20) { // automatic unboxing: Integer(20) -> 20
            System.out.println("20 is at index 1");
        }
    }

}
