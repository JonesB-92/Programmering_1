package Opgave_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Skriv et testprogram, som lader brugeren starte stopuret, og derefter stoppe stopuret, hvorefter
        den forløbne tid skal vises.
        */

        StopWatch stopWatch = new StopWatch();

        System.out.println("\nPress enter to start the timer ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        stopWatch.startTime();

        System.out.println("\nPress enter to stop the timer ");
        scanner.nextLine();
        stopWatch.endTime();

        System.out.println();
        stopWatch.elapsedTimeMILIS();
        System.out.println();

        stopWatch.elapsedTimeSEC();
        System.out.println();

        stopWatch.elapsedTimeDuration();

    }
}
