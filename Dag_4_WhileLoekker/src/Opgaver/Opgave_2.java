package Opgaver;

public class Opgave_2 {
    /* a) Lav en klasse med en main() metode. Tilføj til klassen en metode printPowersOfTwo(), der udskriver alle
potenser af 2 fra 2^0 til 2^20 (Bemærk, at metodens returtype er void, de den ikke returnerer noget.)
Kald metoden i main() metoden. OBS: Metoden må ikke bruge Math.pow(a,b). Metoden skal bruge en
while sætning. */
    public static void main(String[] args) {
        printPowersOfTwo();

    }

    public static void printPowersOfTwo(){

        int currentResult = 1;
        int eksponent = 0;

        while (eksponent <= 20) {
            System.out.println(currentResult);
            currentResult *= 2;
            System.out.println(currentResult);
            eksponent++;
        }


    }
}
