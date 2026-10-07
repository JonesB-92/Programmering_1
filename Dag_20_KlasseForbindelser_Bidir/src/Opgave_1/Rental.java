package Opgave_1;

import java.util.ArrayList;

public class Rental {
    //Nu dobbeltrettet! 0..* dvs arraylists i begge feltvariabler
    private int number;
    private int days;
    private String date;
    private ArrayList<Car> cars;

    public Rental(int number, String date, int days) {
        this.number = number;
        this.date = date;
        this.days = days;
        cars = new ArrayList<>();
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public void addCar(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
            car.addRental(this);
        }
    }

    public void removeCar(Car car) {
        if (cars.contains(car)) {
            cars.remove(car);
            car.removeRental(this);
        }
    }

    public double getPrice() {
        double sum = 0;

        for (Car car : cars) {
            sum += car.getPricePerDay() * days;
        }
        return sum;
    }

    @Override
    public String toString(){
        return "Rental " + number;
    }

}
