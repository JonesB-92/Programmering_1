package Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Opgave_2_23_ {
     /*(Cost of driving) Write a program that prompts the user to enter the distance to
    drive, the fuel efficiency of the car in miles per gallon, and the price per gallon
    then displays the cost of the trip. */

    public static void main(String[] args) {


        //Prompt user to enter distance, fuel efficiency in miles/gallon and the price/gallon
        System.out.println("Please enter the distance in miles, miles/gallon and the price/gallon");

        Scanner input = new Scanner(System.in);

        double distance = input.nextDouble();
        double milesPerGallon = input.nextDouble();
        double pricePerGallon = input.nextDouble();

        double costOfDriving = (distance * pricePerGallon) / milesPerGallon;

        System.out.println("The cost of the trip is " + costOfDriving + " $");

    }
}
