package Opgave_3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        //c. Lav en App klasse, som opretter 5 biler og 2 udlejninger af et antal af de fem biler

        Car car = new Car("1310", 2009);
        Car car1 = new Car("8230", 2010);
        Car car2 = new Car("8210", 2011);
        Car car3 = new Car("420", 2015);
        Car car4 = new Car("1337", 2020);

        car1.setPricePerDay(3000);
        car2.setPricePerDay(4000);

        Rental rental1 = new Rental(1,"12.11.2025", 5);
        Rental rental2 = new Rental(2, "14.12.2025", 30);

        rental1.addCar(car1);
        rental1.addCar(car2);
        rental2.addCar(car1);
        rental2.addCar(car2);

        rental1.getPrice();
        rental2.getPrice();

        System.out.println(rental1.getPrice());
        System.out.println(rental2.getPrice());

    }
}
