import java.util.Scanner;

public class C_ComputeAverage {
    public static void main(String[] args) {
        //Compute average from three different numbers put in by the user
        //Create scanner:
        Scanner input = new Scanner(System.in);

        //Prompt user
        System.out.println("Enter three numbers ");
        //Create three inputs for 3 different doubles
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //Compute average
        double average = (number1 + number2 + number3) / 3;

        //Announce result
        System.out.println("The average of " + number1 + ", " + number2 + " and " + number3 + " is " + average);

    }
}