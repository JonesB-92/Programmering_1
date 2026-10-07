package Opgaver;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Opgave_6_7 {
    /* (PAGE 260) (Financial application: compute the future investment value) Write a method that
    computes future investment value at a given interest rate for a specified number
    of years. The future investment is determined using the formula in Programming Exercise 2.21 (Page 98)

        futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12 */

//Write a test program that prompts the user to enter the investment amount (e.g. 1,000) and
//the interest rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30:

    public static void main(String[] args) {

        System.out.println(futureInvestmentValue(1000, 0.09/12, 30));

    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate,int years) {
        int monthCounter = 1; //Tæller år og skal stoppe ved 30
        int yearCounter = 1;
        double investmentValue = investmentAmount; //Mit slutresultat / total
        int investmentMonth = years;

        while (yearCounter <= years) {
            monthCounter = 1;

            while (12 >= monthCounter) {
                investmentValue += investmentValue * monthlyInterestRate;

                monthCounter++;

            }

            System.out.println(yearCounter + "          " + investmentValue);

            yearCounter++;

        }

        return investmentValue;

    }
}
