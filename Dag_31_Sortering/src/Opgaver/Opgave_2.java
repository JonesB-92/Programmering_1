package Opgaver;

import model.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Opgave_2 {
    private Customer customer;

    //Opgave 2
    public static void main(String[] args) {
        //Lav to udgaver af selectionSort der kan sortere henholdsvis et String[]-array og en ArrayList af
        //Customer. I kan finde Customer i en model-pakke på Canvas. Customers skal sorteres efter deres
        //fornavn.

        ArrayList<Customer> customers = new ArrayList<>();

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

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);
        customers.add(c7);
        customers.add(c8);
        customers.add(c9);
        customers.add(c10);

        String[] s = {"Erna", "Elly", "Laurits", "Bertha", "Christian", "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        System.out.println("\nStrings: ");
        selectionSortString(s);
        System.out.println(Arrays.toString(s) + "\n");

        System.out.println("Coostomers");
//        selectionSortList(customers);
        Collections.sort(customers);
        System.out.println(customers);

        System.out.println("\nOPGAVE 3" +
                "\nInsertion Strings");
        insertionSortString(s);
        System.out.println(Arrays.toString(s) + "\n");
        System.out.println("Insertion List\n");
        insertionSortList(customers);
        System.out.println(customers);
    }

    private static void swapString(String[] list, int i, int j) {
        String temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void selectionSortString(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minPos]) < 0) {
                    minPos = j;
                }
            }
            swapString(list, i, minPos);
        }
    }

    private static void swapArrayList(ArrayList<Customer> list, int i, int j) {
        Customer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
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

    //Opgave 3
    //Lav to udgaver af insertionSort, der kan sorterer henholdsvis et String[]-array og en ArrayList af
    //Customer. Customers skal sorteres efter deres fornavn.
    public static void insertionSortString(String[] strings) {
        for (int i = 1; i < strings.length; i++) {
            String next = strings[i];
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                if (next.compareTo(strings[j - 1]) >= 0) {
                    found = true;
                } else {
                    strings[j] = strings[j - 1];
                    j--;
                }
            }
            strings[j] = next;
        }
    }

    public static void insertionSortList(ArrayList<Customer> customerList) {
        for (int i = 1; i < customerList.size(); i++) {
            Customer next = customerList.get(i);
            int j = i;
            boolean found = false;
            while (!found && j > 0) {
                if (next.getFirstName().compareTo(customerList.get(j - 1).getFirstName()) >= 0) {
                    found = true;
                } else {
                    customerList.set(j, customerList.get(j - 1));
                    j--;
                }
            }
            customerList.set(j, next);
        }
    }
}

