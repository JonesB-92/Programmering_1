package Exercise_4;

import java.util.ArrayList;

public class Ex4Test {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(16);
        arrayList.add(25);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(2);
        arrayList1.add(1);


        System.out.println("\nA method that switches the first and last element in the ArrayList (assume size >= 1).\n");
        System.out.println("\n" + arrayList);
        System.out.println("First " + arrayList.getFirst());
        System.out.println("Last " + arrayList.getLast());
        System.out.println("Switch first and last: " + switchFirstAndLast(arrayList));
        System.out.println("---------------------------");
        System.out.println("Replace even numbers: " + replaceEvenNum(arrayList));
        System.out.println("Replace even numbers: " + replaceEvenNumFixed(arrayList));
        System.out.println("---------------------------");
        System.out.println("Second highest: " + secondHighest(arrayList));
        System.out.println("---------------------------");
        System.out.println("isAscending: True " + isAscending(arrayList));
        System.out.println("isAscending: False " + isAscending(arrayList1));
        System.out.println("isAscendingFix: True " + isAscendingFix(arrayList));
        System.out.println("isAscendingFix: False " + isAscendingFix(arrayList1));
        System.out.println("---------------------------");
        System.out.println("ShiftToTheRight: " + shiftToTheRight(arrayList));
        System.out.println("---------------------------");
        ArrayList<Integer> trueArraylist = new ArrayList<>();
        trueArraylist.add(2);
        trueArraylist.add(5);
        trueArraylist.add(8);
        trueArraylist.add(5);

        ArrayList<Integer> falseArraylist = new ArrayList<>();
        falseArraylist.add(2);
        falseArraylist.add(5);
        falseArraylist.add(8);
        falseArraylist.add(6);
        System.out.println("HasDoublets true: " + hasDoublets(trueArraylist));
        System.out.println("HasDoublets false: " + hasDoublets(falseArraylist));
    }

    //• A method that switches the first and last element in the ArrayList (assume size >= 1).
    //DU SKAL KLONE Arraylist inden, da den ellers ændrer på arraylisten fremover efter at have kaldt metoden.
    public static ArrayList<Integer> switchFirstAndLast(ArrayList<Integer> arrayList) {
        ArrayList<Integer> numsClone = new ArrayList<>(arrayList);
        if (!numsClone.isEmpty()) {
            //Er nødt til at gemme første eller sidste variabel inden jeg bytter, da de jo ændrer sig efter første byt.
            int first = numsClone.getFirst();
            //Replacer første index med sidste
            numsClone.set(0, numsClone.getLast());
            //Replacer sidste med første
            numsClone.set(numsClone.size() - 1, first);
        }
        return numsClone;
    }

    //• A method that replaces all even numbers with 0 (zero).
    public static ArrayList<Integer> replaceEvenNum(ArrayList<Integer> arrayList) {
        arrayList = new ArrayList<>(arrayList);
        if (!arrayList.isEmpty()) {
            for (Integer number : arrayList) {
                if (number % 2 == 0) {
                    //"This is fine for smaller lists, but calling indexOf() repeatedly (inside the loop) is inefficient because it searches through the list to find the index each time."
                    arrayList.set(arrayList.indexOf(number), 0);
                }
            }
        }
        return arrayList;
    }

    //ELLER
    public static ArrayList<Integer> replaceEvenNumFixed(ArrayList<Integer> arrayList) {
        arrayList = new ArrayList<>(arrayList);
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0) {
                    arrayList.set(i, 0);
                }
            }
        }
        return arrayList;
    }

    //• A method that returns the second highest element in the ArrayList (assume size >= 2).
    public static int secondHighest(ArrayList<Integer> arrayList) {
        arrayList = new ArrayList<>(arrayList);

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        if (arrayList.size() >= 2) {
            for (Integer number : arrayList) {
                if (number > highest) {
                    secondHighest = highest;
                    highest = number;
                }
                if (number < highest && number > secondHighest) {
                    secondHighest = number;
                }
            }
            if (secondHighest == Integer.MIN_VALUE) {
                return -1;
            }
        }
        return secondHighest;
    }


    //• A method that returns true if the elements in the ArrayList are sorted ascending.
    public static boolean isAscending(ArrayList<Integer> numsClone) {
        boolean isAscending = false;

        for (int i = 0; i < numsClone.size() - 1; i++) {
            int firstNumber = numsClone.get(i);
            int secondNumber = numsClone.get(i + 1);
            if (firstNumber < secondNumber) {
                isAscending = true;
            } else return false;
        }
        return isAscending;
    }

    //ELLER nemmere:
    public static boolean isAscendingFix(ArrayList<Integer> arrayList) {
        boolean isAscending = true;

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) > arrayList.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    //• A method that shifts all elements in the array to the right (to an index one higher). The
    //last element is shifted to the first index in the ArrayList.
    //Example: {1, 4, 9, 16, 25} is changed to {25, 1, 4, 9, 16}
    public static ArrayList<Integer> shiftToTheRight(ArrayList<Integer> numsClone) {
        numsClone = new ArrayList<>(numsClone);

        //Gemme sidste index og starte fra slutningen, da man ellers skubber indexet til venstre og ikke højre op
        int lastIndex = numsClone.getLast();
        for (int i = numsClone.size() - 1; i > 0; i--) {
            numsClone.set(i, numsClone.get(i - 1));
        }
        numsClone.set(0, lastIndex);
        return numsClone;
    }


    //• A method that returns true if the ArrayList has doublets.
    //Example: true is returned for {2, 5, 8, 5}, false is returned for {2, 5, 8, 6}.
    //Test the methods in the main() method
    public static boolean hasDoublets(ArrayList<Integer> numsClone) {

        for (int i = 0; i < numsClone.size(); i++) {
            int numberAtIndex = numsClone.get(i);
            for (int j = i + 1; j < numsClone.size(); j++) {
                if (numberAtIndex == numsClone.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

}
