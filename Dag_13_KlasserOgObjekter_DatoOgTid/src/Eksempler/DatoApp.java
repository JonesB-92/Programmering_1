package Eksempler;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DatoApp {

    public static void main(String[] args) {

        // Forskellige måder at tildele en LocalDate en værdi

        LocalDate date1 = LocalDate.of(2023, 3, 12); // OBS: No 0 before 3
        LocalDate date2 = LocalDate.of(2023, Month.MARCH, 12);
        LocalDate date3 = LocalDate.parse("2023-03-12");
        LocalDate date4 = LocalDate.now();

        int year = date1.getYear(); // 2023
        LocalDate date5 = date1.plusDays(2); // 2023-03-14
        boolean b1 = date1.isBefore(date5); // true
        boolean b2 = date1.isEqual(date2); // true

        // Forskellige måder at tildele en LocalTime en værdi

        LocalTime time1 = LocalTime.of(12, 30);
        LocalTime time2 = LocalTime.parse("12:30");
        LocalTime time3 = LocalTime.now();
        int hour = time1.getHour(); // 12
        LocalTime time4 = time1.minusHours(2); // 10:30
        boolean b3 = time1.equals(time2); // true

        // LocalDateTime dato og klokkeslet i samme objekt

        LocalDateTime dt = LocalDateTime.of(2023, 11, 3, 10, 30);
        System.out.println(dt.toLocalDate());
        System.out.println(dt.toLocalTime());
        LocalDateTime fra = LocalDateTime.of(2023, 11, 8, 8, 0);
        LocalDateTime til = LocalDateTime.of(2023, 11, 9, 7, 59);
        System.out.println("dage mellem " + fra + " " + til + " " + ChronoUnit.DAYS.between(fra, til));

        // Varigheden mellem to datoer repræsenteret i år, måneder og dage

        Period period1 = Period.of(2, 5, 20); // 2 år 5 måneder 20 dage
        Period period2 = Period.parse("P2Y5M20D"); // 2 år 5 måneder 20 dage
        Period period4 = period1.plusYears(2); // 4 år 5 måneder 20 dage
        String s = period1.toString(); // "P2Y5M20D"
        int months = period1.getMonths(); // 5
        boolean b4 = period1.equals(period2); // true
        Period period3 = Period.between(LocalDate.parse("2021-01-10"), LocalDate.parse("2023-05-20"));
        long days = period3.getDays();
        long monthss = period3.getMonths();
        long years = period3.getYears();
        System.out.println("Fra 2021-01-10" + " til 2023-05-20" + " er der " + years + " år " + months + " måneder " + days + " dage");

        monthss = ChronoUnit.MONTHS.between(date1, date4);
        days = ChronoUnit.DAYS.between(date1, date4);
        System.out.println("Dage mellem: " + date1 + " " + date4 + ": " + days);
        System.out.println("Måneder mellem: " + date1 + " " + date4 + ": " + monthss);
    }

}
