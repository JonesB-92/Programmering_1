package Opgave_5;

import java.util.ArrayList;

public class Episode {
    private int number;
    private ArrayList<String> guestActors;
    private int lengthMinutes;

    //Opgave 5.2
    //Implementér kompositionen mellem Series og Episode. Du skal også tilføje en konstruktor til
    //klassen Episode. Konstruktøren for Episode skal initialisere alle attributter i klassen.
    public Episode(int number, ArrayList<String> guestActors, int lengthMinutes) {
        this.number = number;
        this.lengthMinutes = lengthMinutes;

        //If the caller modifies the original guestActors list, it will also modify Episode’s internal list.
        //This violates encapsulation.
//        this.guestActors = guestActors;
        this.guestActors = new ArrayList<>(guestActors); // ✅ Defensive Copy
    }

    public int getNumber(){
        return number;
    }

    public ArrayList<String> getGuestActors(){
        return new ArrayList<>(guestActors);
    }

    public int getLengthMinutes(){
        return lengthMinutes;
    }
}
