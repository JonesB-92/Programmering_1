package Exercises;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Opgave_2_23 {

    public static void main(String[] args) {


    /*(Cost of driving) Write a program that prompts the user to enter the distance to
    drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
    then displays the cost of the trip. */

        //Erklærer en scannervariable, som skal modtage input, og definerer den som en ny scanner
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        //Erklærer og definerer variabler, der skal bruges.
        double distance = input.nextDouble();
        double fuel_efficiency = input.nextDouble();
        double price_per_gallon = input.nextDouble();

        double PricePrTrip = distance / fuel_efficiency * price_per_gallon;

        System.out.println("Please enter the distance of the trip");
        System.out.println("The price per trip is " + PricePrTrip);

    }
}
