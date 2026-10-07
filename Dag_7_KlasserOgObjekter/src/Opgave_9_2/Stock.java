package Opgave_9_2;

public class Stock {
    /*9.2 (The Stock class) design a class named Stock that contains:
■ A string data field named symbol for the stock’s symbol.
■ A string data field named name for the stock’s name.
■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■ A double data field named currentPrice that stores the stock price for the
current time.
■ A constructor that creates a stock with the specified symbol and name.
■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.

Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle
Corporation, and the previous closing price of 34.5. Set a new current price to
34.35 and display the price-change percentage.*/

    private String symbol;
    private String name;
    private double previousClosingPrice = 0;
    private double currentPrice = 0;


    public Stock (String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getPreviousClosingPrice(double previousClosingPrice) {
        return previousClosingPrice;
    }

    public double getCurrentPrice(double currentPrice) {
        return currentPrice;
    }

    //A method named getChangePercent() that returns the percentage changed
    //from previousClosingPrice to currentPrice.
    public double getChangePercent() {
        double changePercent = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;

        return changePercent;
    }
}
