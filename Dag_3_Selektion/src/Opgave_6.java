import java.util.Scanner;

public class Opgave_6 {
    //Koden fra opgave 2 skal nu anvende metoder, så indlæsning af data og
    //udskrivning af resultat foregår i MAIN(), hvorimod koden der afgør om et tal er
    //positivt, negativet eller nul foregår i en METODE.
    // Metoden kan have navnet sign(), skal tage et heltal som parameter og returnere en String
    //Programmer metoden sign() og kald den fra main().

    // METODE kan have navnet sign(), skal tage et heltal som parameter og returnere en String
    public static String sign(int number) {
        String besked;

        if (number < 0) {
            besked = "Negativ";
        } else if (number > 0) {
            besked = "Positiv";
        } else {
            besked = "Nul";
        }

        return besked;

    }

    public static void main(String[] args) {
        //anvende metoder, så indlæsning af data og udskrivning af resultat

        //Hente scanner
        Scanner scannerInt = new Scanner(System.in);
        //Efterspørge input fra bruger
        System.out.println("Indtast et heltal");

        //lagr int fra bruger
        int intFraBruger = scannerInt.nextInt();

        String besked = sign(intFraBruger);

        //Spil funktion
        System.out.println(besked);
        System.out.println(sign(intFraBruger));
    }

}
