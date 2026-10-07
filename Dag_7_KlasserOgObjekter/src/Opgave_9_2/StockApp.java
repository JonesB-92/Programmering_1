package Opgave_9_2;

public class StockApp {
    /*Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle
    Corporation, and the previous closing price of 34.5. Set a new current price to
    34.35 and display the price-change percentage.*/

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL ","Oracle Corporation");

        stock.getPreviousClosingPrice(34.5);
        stock.getCurrentPrice(34.35);
        stock.getChangePercent();
        System.out.println(stock.getPreviousClosingPrice(34.5));
        System.out.println(stock.getCurrentPrice(34.35));
        System.out.println(stock.getChangePercent());

        System.out.println();
        System.out.println("");
        System.out.println(stock.getChangePercent());

    }
}
