import java.util.Scanner;
/* The program in Listing 2.5 obtains minutes and remaining seconds from an amount of time
in seconds. For example, 500 seconds contains 8 minutes and 20 seconds.*/
public class F_DisplayTime_2_5_Modulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompt user for input as seconds
        System.out.println("Enter an integer for seconds");

        int seconds = input.nextInt();

        //Minutes in seconds
        int minutesInSeconds = seconds / 60;
        //Remaining seconds
        int remainingSeconds = seconds % 60;

        System.out.println(seconds + " seconds is " + minutesInSeconds + " minutes and " + remainingSeconds + " seconds.");

    }
}
