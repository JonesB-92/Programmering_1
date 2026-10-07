package Opgave_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestClass {
//Lav en test-klasse hvor du opretter to udlejninger. Den ene udlejning skal starte den første i
//næste måned og den anden skal starte om 10 måneder fra i dag.
    public static void main(String[] args) {
        //Starter første i næste måned
        Rental rental1 = new Rental(420, 250, 15, LocalDate.of(2025, 4, 1));

        //Starter 10 mdr. fra i dag
        Rental rental2 = new Rental(1337, 600, 70, LocalDate.now().plusMonths(10));

//Udskriv den totale pris, slutdatoen og dagen før startdatoen for hver af udlejningerne
        System.out.println("\nRENTAL1: ");
        System.out.println("Totale pris for " + rental1.getDaysRentedOut() + " dage: " + rental1.getTotalPrice());
        System.out.println("Slutdato: " + rental1.getEndDate());
        System.out.println("Dagen før stardato " + rental1.getStartDate().minusDays(1));

        System.out.println("\n--------");

        System.out.println("\nRENTAL2: ");
        System.out.println("Totale pris for " + rental2.getDaysRentedOut() + " dage: " + rental2.getTotalPrice());
        System.out.println("Slutdato: " + rental2.getEndDate());
        System.out.println("Dagen før stardato " + rental2.getStartDate().minusDays(1));

        System.out.println("________________________________________\n");

//Udskriv antallet af år, måneder og dage mellem startdatoen for den første udlejning og startdatoen på den anden udlejning
        System.out.println("Rental1 blev udlejet d." + rental1.getStartDate() + " og Rental2 blev udlejet d." + rental2.getStartDate());
        //Med Period
        Period periodBetweenRent1Rent2 = Period.between(rental1.getStartDate(), rental2.getStartDate());
        System.out.println("Perioden mellem de to datoer er på " + periodBetweenRent1Rent2);

        System.out.println("\n--------");
        //Med ChronoUnit
        System.out.println("År: " + ChronoUnit.YEARS.between(rental1.getStartDate(), rental2.getStartDate()));
        System.out.println("Måneder: " + ChronoUnit.MONTHS.between(rental1.getStartDate(), rental2.getStartDate()));
//• Udskriv også antallet af dage mellem startdatoerne for de to udlejninger.
        System.out.println("Dage: " + ChronoUnit.DAYS.between(rental1.getStartDate(), rental2.getStartDate()));

        }
}
