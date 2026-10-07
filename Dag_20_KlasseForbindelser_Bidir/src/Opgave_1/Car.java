package Opgave_1;

import java.util.ArrayList;

public class Car {
    private String license;
    private double pricePerDay;
    private int yearOfPurchase;
    private ArrayList<Rental> rentals;

    public Car(String license, int yearOfPurchase) {
        this.license = license;
        this.yearOfPurchase = yearOfPurchase;
        this.rentals = new ArrayList<>();
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public String getLicense() {
        return license;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }

    public ArrayList<Rental> getRentals(){
        return new ArrayList<>(rentals);
    }

    //Lave add og removes på Rentalobjekter ----------------------------------------
    public void addRental(Rental rental) {
        if (!rentals.contains(rental)) {
            rentals.add(rental);
            rental.addCar(this);
        }
    }

    public void removeRental(Rental rental) {
        if (rentals.contains(rental)) {
            rentals.remove(rental);
            rental.removeCar(this);
        }
    }

    public int getLongesRental() {
        int longestRental = 0;
        for(Rental rental : rentals) {
            if(rental.getDays() > longestRental) {
                longestRental = rental.getDays();
            }
        }
        return longestRental;
    }

    @Override
    public String toString() {
        return license;
    }
}
