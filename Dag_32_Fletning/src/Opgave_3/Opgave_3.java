package Opgave_3;

import model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Opgave_3 {
    public static void main(String[] args) {
        ArrayList<Customer> allCustomers = new ArrayList<>();
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
        Customer c17 = new Customer("Axel", "Vexley", 22);

        allCustomers.add(c1);
        allCustomers.add(c2);
        allCustomers.add(c3);
        allCustomers.add(c4);
        allCustomers.add(c5);
        allCustomers.add(c6);
        allCustomers.add(c7);
        allCustomers.add(c17);
        Collections.sort(allCustomers);
        System.out.println("All customers " + allCustomers);

        Customer[] badCustomers = new Customer[6];
        badCustomers[0] = new Customer("Axel", "Grimsbane", 40);
        badCustomers[1] = new Customer("Selene", "Ironhart", 35);
        badCustomers[2] = new Customer("Finn", "Stormrider", 28);
        badCustomers[3] = new Customer("Lyra", "Frostvale", 24);
        badCustomers[4] = new Customer("Cassian", "Rook", 32);
        badCustomers[5] = new Customer("Isla", "Thorne", 26);

        System.out.println("BAD customers " + Arrays.toString(badCustomers));
        Arrays.sort(badCustomers);
        System.out.println("BAD customers SORTERET " + Arrays.toString(badCustomers));

        System.out.println("-------------------------------------");
        System.out.println("BAD customers " + Arrays.toString(badCustomers));
        System.out.println("All customers " + allCustomers);
        System.out.println("METODEKALD " + goodCustomers(allCustomers, badCustomers));

    }

    public static ArrayList goodCustomers(ArrayList<Customer> l1, Customer[] l2) {
        ArrayList<Customer> goodCustomers = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;
        while (i1 < l1.size() && i2 < l2.length) {
            if (l1.get(i1).compareTo(l2[i2]) < 0) {
                goodCustomers.add(l1.get(i1));
                i1++;
            } else if (l1.get(i1).compareTo(l2[i2]) == 0) {
                i1++;
            } else {
                i2++;
            }
        }
        // tøm den liste der ikke er tom
        while (i1 < l1.size()) {
            goodCustomers.add(l1.get(i1));
            i1++;
        }
        while (i2 < l2.length) {
            goodCustomers.add(l2[i2]);
            i2++;
        }

        return goodCustomers;
    }
}
