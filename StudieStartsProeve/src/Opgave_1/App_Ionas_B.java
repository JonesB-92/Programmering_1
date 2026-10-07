package Opgave_1;

import java.util.Scanner;

public class App_Ionas_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast fornavn og energiindtag i kJ pr. uge");
        String firstName = scanner.nextLine();
        double weeklykJ = scanner.nextDouble();
        System.out.println("Energiindtag i kJ per uge: " + weeklykJ);

        //dagligt energiindtag i kcal= (antal kJ/uge) / (7 dage) / 4184 kJ pr. kcal
        double averageDailyIntakeKcal = ((weeklykJ / 7) / 4.184);
        System.out.println("Energiindtaget omregnet: " + averageDailyIntakeKcal + " kcal pr. dag.");

        //antal burgermenuer i energiindtag (dagligt eller ugentligt??)
        double burgerMenukcal = 1406.0;
        double antalBurgerMenuer = averageDailyIntakeKcal / burgerMenukcal;
        System.out.println("Indtaget svarer til: " + antalBurgerMenuer + " burgermenuer pr. dag.");

        //Udskriv navn og forventede aktivitetsniveau ift. daglige energiindtag
        String aktivitetsniveau;
        //Lavt
        if (averageDailyIntakeKcal < 2300) {
            aktivitetsniveau = "Lav aktivitet";
        }//Moderat
        else if (averageDailyIntakeKcal > 2300 && averageDailyIntakeKcal < 2600) {
            aktivitetsniveau = "Moderat aktivitet";
        }//Højt
        else aktivitetsniveau = "Høj aktivitet";

        System.out.println(firstName + ", med dit energiindtag forventes dit aktivitetsniveau at være: " +
                aktivitetsniveau);
    }
}