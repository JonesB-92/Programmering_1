package Exercises;

import java.util.Scanner;

public class Opgave_2_6 {
    /* 2.6 (Sum the digits in an integer) Write a program that reads an integer between 0
     and 1000 and adds all the digits in the integer. For example, if an integer is 932,
     the sum of all its digits is 14.
     Hint: Use the % operator to extract digits, and use the / operator to remove the
     extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
     */

    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Choose a number between 0 and 1000.");

        //Jeg erklærer og definerer variablen num til at være et helt tal.
        // input1.nextInt() beder om input (en int) fra konsollen og gemmer det i variablen num.
        int num = input1.nextInt();
        // Jeg erklærer en ny variabel, som hedder sum.
        int sum;

        System.out.println(sum = num % 10);
        //sum bliver her det sidste tal = 2
        System.out.println(num = num / 10);
        //num bliver her de to første tal = 93
        System.out.println("sum of digits = ");



    //  sum=2     num=93
        sum += num % 10;
    //   sum=2+3   = 5    num=93

        num = num / 10;
    //      num = 93 / 10 = 9 (Int)

    //  5 += 9 !!! Hurrah
        sum += num;
        System.out.println(sum);
    }

}
