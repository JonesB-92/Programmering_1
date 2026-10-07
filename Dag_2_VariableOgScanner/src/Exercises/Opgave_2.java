package Exercises;

import java.util.Locale;

public class Opgave_2
{
    public static void main(String[] args) {

        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";

        //a) Færdiggør programmet så det udskriver ord1 med store bogstaver.
        System.out.println("a) Færdiggør programmet så det udskriver ord1 med store bogstaver.");
        System.out.println(ord1.toUpperCase() + ord2);

        //b) Færdiggør programmet så det udskriver ord2 med små bogstaver.
        System.out.println("b) Færdiggør programmet så det udskriver ord2 med små bogstaver.");
        System.out.println(ord1 + ord2.toLowerCase());

        //c)Færdiggør programmet så det sammensætter ord1 og ord2 med et mellemrum imellem og udskriver resultatet.
        System.out.println("c)Færdiggør programmet så det sammensætter ord1 og ord2 med et mellemrum imellem og udskriver resultatet.");
        System.out.println(ord1 + " " + ord2);

        /* d) Færdiggør programmet så det i en ny streng, ord3, sammensætter ord1 og ord2, hvor ord2 er
        med små bogstaver. Udskriv resultatet.*/
        System.out.println(
        "d) Færdiggør programmet så det i en ny streng, ord3, sammensætter ord1 og ord2, hvor ord2 er " +
        "med små bogstaver. Udskriv resultatet.");
        String ord3 =ord1 + ord2.toLowerCase();
        System.out.println(ord3);

        //e) Udskriv længden af strengen fra opgave d).
        System.out.println("e) Udskriv længden af strengen fra opgave d).");
        System.out.println("Længden af strengen på " + ord3 + " er " + ord3.length());

        //f) Udskriv de første 7 bogstaver af ord1.
        System.out.println("f) Udskriv de første 7 bogstaver af ord1.");
        String FørsteSyv = ord1.substring(0,7);
        System.out.println(FørsteSyv);
        //ELLER?
        //System.out.println(ord1.charAt(0-7));

        //g) Udskriv bogstav 3-7 fra ord2.
        System.out.println("g) Udskriv bogstav 3-7 fra ord2.");
        String TreTilSyv = ord2.substring(2,7);
        System.out.println(TreTilSyv);

        //h) Udskriv den sidste halvdel af strengen fra opgave d).
        System.out.println("h) Udskriv den sidste halvdel af strengen fra opgave d).");
        System.out.println("Længden af strengen på " + ord3.toLowerCase() + " er " + ord3.length() + "bogstaver");
        System.out.println("Halvdelen af " + ord3.toLowerCase() + " er på " + ord3.length()/2 + " bogstaver");
        System.out.println("Halvdelen af " + ord3.toLowerCase() + " er " + ord3.substring(ord3.length()/2));

    }

}