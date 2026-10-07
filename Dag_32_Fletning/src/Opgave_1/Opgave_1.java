package Opgave_1;

import model.Customer;

import java.util.ArrayList;

public class Opgave_1 {

    //Opgave 1
    //Denne opgave går ud på at lave en total fletning af to ArrayLists indeholdende Customer objekter.
    //a) Programmér en klasse med en main() metode.
    public static void main(String[] args) {
        //c) Lav i main()-metoden to ArrayLists indeholdende Customer-objekter (fx 8 i den ene og 3 i
        //den anden)
        ArrayList<Customer> l1 = new ArrayList<>();

        Customer c1 = new Customer("Zane", "Wolfhart", 33);
        Customer c2 = new Customer("Luna", "Starfield", 25);
        Customer c3 = new Customer("Orion", "Nightshade", 42);
        Customer c4 = new Customer("Kaia", "Driftwood", 29);
        Customer c5 = new Customer("Jaxon", "Stone", 38);
        Customer c6 = new Customer("Nova", "Skye", 31);
        Customer c7 = new Customer("Riven", "Ashfall", 47);
        Customer c8 = new Customer("Talia", "Moonsong", 36);
        Customer c9 = new Customer("Ezra", "Hawke", 27);
        Customer c10 = new Customer("Mira", "Vexley", 22);

        l1.add(c1);
        l1.add(c2);
        l1.add(c3);
        l1.add(c4);
        l1.add(c5);
        l1.add(c6);
        l1.add(c7);
        l1.add(c8);
        l1.add(c9);
        l1.add(c10);

        ArrayList<Customer> l2 = new ArrayList<>();

        Customer c11 = new Customer("Axel", "Grimsbane", 40);
        Customer c12 = new Customer("Selene", "Ironhart", 35);
        Customer c13 = new Customer("Finn", "Stormrider", 28);
        Customer c14 = new Customer("Lyra", "Frostvale", 24);
        Customer c15 = new Customer("Cassian", "Rook", 32);
        Customer c16 = new Customer("Isla", "Thorne", 26);

        l2.add(c11);
        l2.add(c12);
        l2.add(c13);
        l2.add(c14);
        l2.add(c15);
        l2.add(c16);


        //d) Sørg for at listerne er sorteret efter kundernes navn
        System.out.println(l1);
        selectionSortList(l1);
        System.out.println("\nSORTERET: " + l1);

        System.out.println("\n" + l2);
        selectionSortList(l2);
        System.out.println("\nSORTERET: " + l2);

        System.out.println("\n" + fletAlleKunder(l1, l2));


    }

    //b) Programmér følgende metode som en totalfletning i samme klasse.
    public static ArrayList fletAlleKunder(ArrayList<Customer> l1, ArrayList<Customer> l2) {
        ArrayList<Customer> flettedeListe = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;
        while (i1 < l1.size() && i2 < l2.size()) {
            if (l1.get(i1).compareTo(l2.get(i2)) <= 0) {
                flettedeListe.add(l1.get(i1));
                i1++;
            } else {
                flettedeListe.add(l2.get(i2));
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < l1.size()) {
            flettedeListe.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.size()) {
            flettedeListe.add(l2.get(i2));
            i2++;
        }

        return flettedeListe;
    }


    public static void selectionSortList(ArrayList<Customer> listOfCustomers) {
        for (int i = 0; i < listOfCustomers.size(); i++) {
            int minPos = i;
            for (int j = i + 1; j < listOfCustomers.size(); j++) {
                //Kan undlade "getFirstName" ved at override compareTo metoden på Customer klassen!
                //Derved kan vi også bruge Collections.sort metoden
                if (listOfCustomers.get(j).compareTo(listOfCustomers.get(minPos)) < 0) {
                    minPos = j;
                }
            }
            swapArrayList(listOfCustomers, i, minPos);
        }
    }

    private static void swapArrayList(ArrayList<Customer> list, int i, int j) {
        Customer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

}
