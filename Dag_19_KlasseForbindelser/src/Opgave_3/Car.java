package Opgave_3;

public class Car {
    private String license;
    private double pricePerDay;
    private int yearOfPurchase;

    public Car(String license, int yearOfPurchase) {
        this.license = license;
        this.yearOfPurchase = yearOfPurchase;
    }

    public void setPricePerDay(double pricePerDay){
        this.pricePerDay = pricePerDay;
    }

    public double getPricePerDay(){
        return pricePerDay;
    }

    public String getLicense(){
        return license;
    }

    public int getYearOfPurchase(){
        return yearOfPurchase;
    }
}
