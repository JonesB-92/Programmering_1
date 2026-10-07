import java.util.Scanner;

public class Boolean_2 {
    //Simple if demo

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Bed om Int
        System.out.println("Enter an integer");

        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println("HiFive!");
        }
        if (number % 2 == 0) {
            System.out.println("HiEven!");
        }
        //3.3.1 Write an if statement that assigns 1 to x if y is greater than 0.
        int y = 0, x = 0;
        if ( y > 0 ) {
            x = 1;
        }

        //3.3.2 Write an if statement that increases pay by 3% if score is greater than 90
        int pay = 1000;
        int score = 91;

        if (score > 90) {
            //IncreasePay = ((pay * 0.03) + pay);
            pay *= 1.03;
            System.out.println(pay);
        }


    }

}

