import java.util.Scanner;

public class Opgave_7 {
//Koden fra opgave 3 skal nu anvende metoder, så indlæsning af data og
//udskrivning af resultat foregår i main(), hvorimod koden der afgør om de tre tal er
//voksende, aftagende eller hverken eller foregår i en metode.
//Metoden kan have navnet inorder, skal tage tre heltal som parameter og returnere en String
//Programmer metoden inorder og kald den fra main.

    //Kode der afgør, om de tre heltal er voksende osv i METHODE inorder
    public static String inOrder(int num1, int num2, int num3) {
        String besked;

        if (num1 < num2 && num2 < num3) {
            besked = "Stigende";
        } else if (num1 > num2 && num2 > num3) {
            besked = "Aftagende.";
        } else besked = "Hverken eller";

        return besked;
    }

    public static void main(String[] args) {
        //Skab scanner
        Scanner inputFraBruger = new Scanner(System.in);

        //Input af 3 heltal
        int num1 = inputFraBruger.nextInt();
        int num2 = inputFraBruger.nextInt();
        int num3 = inputFraBruger.nextInt();

        //Funktion køres og udskriver besked
        String besked = inOrder(num1, num2, num3); // aftagende

        //Printer besked / STRING!!
        System.out.println(besked);
        System.out.println(inOrder(num1, num2, num3));

    }

}


