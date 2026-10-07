package Opgave_3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rental {
    private int number;
    private double priceDaily;
    private int daysRentedOut;
    private LocalDate startDate;

    public Rental(int number, double priceDaily, int daysRentedOut, LocalDate startDate) {
        this.number = number;
        this.priceDaily = priceDaily;
        this.daysRentedOut = daysRentedOut;
        this.startDate = startDate;
    }

    public void setDaysRentedOut(int daysRentedOut){
        this.daysRentedOut = daysRentedOut;
    }

    public int getDaysRentedOut() {
        return daysRentedOut;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate(){
        return startDate.plusDays(daysRentedOut);
    }

    public double getPricePrDay() {
        return getPricePrDay();
    }

    public double getTotalPrice(){
        return priceDaily * ChronoUnit.DAYS.between(startDate, getEndDate());
    }

}
