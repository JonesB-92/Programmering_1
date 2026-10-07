package Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Opgave_2_7 {
    /* 2.7 (Find the number of years) Write a program that prompts the user to enter the
    minutes (e.g., 1 billion), and displays the maximum number of years and remaining days for the minutes.
    For simplicity, assume that a year has 365 days.

    Vi skal altså finde ud af, hvor mange år, dage, timer og minutter, x antal minutter udgør.
    */

    //Definér minutter ift. timer, dag osv.
    public static void main(String[] args) {
        System.out.println("Antal minutter brugt på internettet: ");

    //Jeg beder om et input fra konsollen
    Scanner input = new Scanner(System.in);

    //Erklærer variabel "minut" som en int og definerer det til det input, jeg får fra scanneren, hvilket skal være en int.
    int minut = input.nextInt();
    int sekund = minut * 60;
    int time = minut / 60;
    int dag = time / 24;
    int år = dag / 365;

        System.out.println(år + " år " + dag % 365 + " dage " + time % 24 + " timer " + minut % 60 + " minutter og " + sekund % 60 + " sekunder ");
        System.out.println("har du brugt på at goone i dit ensomme, triste liv.");

    }

}
