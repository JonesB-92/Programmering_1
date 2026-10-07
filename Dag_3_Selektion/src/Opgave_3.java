import java.util.Scanner;

public class Opgave_3 {
    /*Lav et program der indlæser 3 heltal fra tastaturet og udskriver ”aftagende” hvis
    de tre tal er i aftagende orden, ”voksende” hvis de tre tal er i voksende orden eller
    ”hverken eller” hvis de ikke er nogen af delene.
     F.eks. 2 3 4 er voksende
            4 3 2 er aftagende
            3 4 2 hverken eller*/

    public static void main(String[] args) {

        //Indlæs 3 heltal fra bruger
        Scanner input = new Scanner(System.in);

        System.out.println();
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        //If sætning med sout "aftagende, stigende eller hverken eller"
        if (number1 < number2 && number2 < number3) {
            System.out.println("Stigende");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Aftagende");
        } else System.out.println("Hverken eller");
    }
}
