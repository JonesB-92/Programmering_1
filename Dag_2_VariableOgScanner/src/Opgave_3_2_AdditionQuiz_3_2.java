import java.util.Scanner;
import java.util.Random;

public class Opgave_3_2_AdditionQuiz_3_2 {
/*3.2 (Game: multiply three numbers) The program in Listing 3.1, Addition Quiz.java,
generates two integers and prompts the user to enter the product of these two integers.
Revise the program to generate three single-digit integers and prompt the
user to enter the multiplication of these three integers.*/

    public static void main(String[] args) {
        /* Disse giver konstant negative values, så jeg ændrer den til random type
        int number1 = (int) System.currentTimeMillis() % 10;
        int number2 = (int) System.currentTimeMillis() / 10 % 10;
        int number3 = (int) System.currentTimeMillis() / 100 % 10;
        */
        //Skaber en random generator
        Random rand = new Random();

        //Skaber 3 random single digit tal (0-10)
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);
        int number3 = rand.nextInt(10);

        //Prompt, der viser regnskabet
        System.out.println("What is " + number1 + " * " + number2 + " * " + number3 + "? ");

        //Skab scanner så bruger kan skrive svaret
        Scanner inputAnswer = new Scanner(System.in);

        //Svaret fra bruger
        int answer = inputAnswer.nextInt();

        //Vis resultatet - true or false?
        System.out.println(number1 + " * " + number2 + " * " + number3 +  " = " + answer + " is " + (number1 * number2 * number3 == answer));
        System.out.println("The real answer is " + (number1 * number2 * number3));

    }

}


