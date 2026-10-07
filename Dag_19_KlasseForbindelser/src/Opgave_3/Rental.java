package Opgave_3;

import java.util.ArrayList;

public class Rental {
    /* a. Hvad betyder det at multipliciteten er 0..* i begge retninger?
     * At begge kan have 0 til mange af hver klasse, men pilen betyder, at kun rental skal huske (her en arrayliste af)
     * cars. */
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

    public void addCar(Car car) {
        if (!cars.contains(car)) {
            cars.add(car);
        }
    }

    public void removeCar(Car car) {
        if (cars.contains(car)) {
            cars.remove(car);
        }
    }

    //d. Programmér metoden getPrice i klassen Rental og afprøv den i Test klassen. Metoden
    //udregner prisen for en udlejning ved at summere alle de tilhørende bilers pris pr. dag og
    //gange med det antal dage, som udlejningen varer.
    public double getPrice() {
        double sum = 0;

        for (Car car : cars) {
            sum += car.getPricePerDay() * days;
        }
        return sum;
    }

}
