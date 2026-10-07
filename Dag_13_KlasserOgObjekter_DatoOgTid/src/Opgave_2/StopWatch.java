package Opgave_2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class StopWatch {
    //• felterne startTime: LocalTime, endTime: LocalTime
    private LocalTime startTime;
    private LocalTime stopTime;

    // • en no-arg constructor
    //(Hvis ikke man laver en constructor, har classen en default "indbygget".

    //• en metode start(), der sætter startTime til aktuelt tidspunkt
    public void startTime() {
        startTime = LocalTime.now();
        System.out.println("Your start-time is: " + startTime);
    }

    //• en metodede stop(), der sætter endTime til aktuelt tidspunkt
    public void endTime() {
        stopTime = LocalTime.now();
        System.out.println("Your end-time is: " + stopTime);
    }

    //• en metode elapsedTime(), der returnerer den forløbne tid i sekunder
    public double elapsedTimeMILIS() {
        double amountOfSeconds = (ChronoUnit.MILLIS.between(startTime, stopTime) / 1000.0);
        System.out.println("ElapsedTime (ChronoUnit.MILIS) \n" + amountOfSeconds + " seconds have passed.");

        return amountOfSeconds;
    }

    public double elapsedTimeSEC() {
        double amountOfSeconds = (double) (ChronoUnit.SECONDS.between(startTime, stopTime));
        //SECONDS her er et heltal ligemeget hvad, da det er hele sekunder, den returnerer. Så selvom den lagres i en double
        //bliver det maks int.0!!
        System.out.println("ElapsedTime (ChronoUnit.SECONDS) \n" + amountOfSeconds + " seconds have passed.");

        return amountOfSeconds;
    }

    public double elapsedTimeDuration() {
        Duration elapsedTime = Duration.between(startTime, stopTime);
        System.out.println("Elapsedtime.toMilis()");
        System.out.println((double) elapsedTime.toMillis() / 1000 + " seconds have passed.");

        return (double) elapsedTime.toMillis() / 1000;
    }

}
