import java.util.Scanner;

public class Opgave_2 {
    /*Opgave 2
    Lav et program der indlæser et heltal fra tastaturet og udskriver negativ, nul eller
    positiv, afhængig af om det indlæste tal er <, == eller > end 0.
    */
    public static void main(String[] args) {
        //Registrer et heltal fra bruger
        Scanner intFraBruger = new Scanner(System.in);
        System.out.println("Indtast et vilkårligt tal");

        int input = intFraBruger.nextInt();

        // < == eller > 0, sout negativ, nul eller positiv
        if (input == 0) System.out.println("Nul");
        if (input < 0) System.out.println("Negativ");
        if (input > 0) System.out.println("Positiv");

        if (input < 0) {
            System.out.println("Negativ");
        } else if (input > 0 ) {
            System.out.println("Positiv");
        } else {System.out.println("Nul");
        }

    }

}
