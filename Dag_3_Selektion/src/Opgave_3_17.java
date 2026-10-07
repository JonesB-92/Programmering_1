import java.util.Random;
import java.util.Scanner;

public class Opgave_3_17 {
//(Game: scissor, rock, paper) Write a program that plays the popular scissor–rock–paper game.
// The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
// The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
// whether the user or the computer wins, loses, or draws. Here are sample runs:

    public static void main(String[] args) {

        //Random generate a number between 0-2
        Random computer1 = new Random();

        int computerInt = computer1.nextInt(0, 2);

        //Skab scanner og få 1 input fra bruger
        Scanner scanner = new Scanner(System.in);

        //prompt user for inputs
        System.out.println(" ");
        System.out.println("Vælg et tal mellem 0 og 2, hvor 0 er Rock, 1 er Scissor, og 2 er Paper");
        int gamerInt = scanner.nextInt();

        System.out.println(result(gamerInt, computerInt));


    }

    //Assign numbers to choices (rock, scissor, paper)
    public static String talConverterTilString(int computerInt) {
        String RockPaperScissor;

        //If sætning -- 0 = rock, 1 = scissor, 2 = Paper
        if (computerInt == 0) {
            RockPaperScissor = "rock"; // = 0
        } else if (computerInt == 1) {
            RockPaperScissor = "scissor"; // = 1
        } else RockPaperScissor = "paper"; // = 2

        return RockPaperScissor;

    }

    //Anvend funktion for at definerer rock, paper scissor
    public static String result(int gamer, int computer) {
        //Lave string til choices
        String choice = "You chose " + talConverterTilString(gamer) + " and the computer chose " + talConverterTilString(computer) + ". ";

        //lave string til resultatet
        String result;

        //Gamer wins
        if ((gamer == 0 && computer == 1) || (gamer == 1 && computer == 2) || (gamer == 2 && computer == 0)) {
            result = choice + "You win!";
        //Draw
        } else if (gamer == computer) {
            result = choice + "You chose the same thing! It's a draw.";
        //You lose
        } else result = choice + "You lose!";

        return result;
    }


}





