package Opgave_2;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    //Person har 0..* gaver:
    private ArrayList<Gift> gifts;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        gifts = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Gift> getGifts() {
        return new ArrayList<>(gifts);
    }

    //Derfor skal man gennem en person, som er den eneste, der kender til mængden af gaver, kunne add og remove gifts
    public void addGift(Gift gift) {
        if (!gifts.contains(gift)) {
            gifts.add(gift);
        }
    }

    public void removeGift(Gift gift) {
        if (gifts.contains(gift)) {
            gifts.remove(gift);
        }
    }

    //c. Nu skal der tilføjes en metode, der beregner, den samlede værdi af de gaver en person
    //modtager. På hvilken klasse skal denne metode ligge? På Person klassen, da den har styr på, hvor mange og hvilke gaver,
    //den har modtaget
    public double totalGiftPrice() {
        double totalPrice = 0;
        for (Gift gift : gifts) {
            totalPrice += gift.getPrice();
        }
        return totalPrice;
    }

    //e. Implementer associeringen "given by", idet der kun er brug for at navigere fra gave til den der
    //giver gaven. Bemærk, associeringen er igen enkeltrettet, De to associeringer beskriver forskellig information
    public void giveGift(Gift gift, Person receiver) {
        gift.setGiver(this);
        if (!receiver.gifts.contains(gift)) {
            receiver.gifts.add(gift);
        }
    }

    //f. Tilføj nu en metode, der returnerer de personer, en person modtager gaver fra. Hvor skal
    //denne metode placeres?
    public ArrayList<Person> getGifters() {
        ArrayList<Person> gifters = new ArrayList<>();
        for (Gift gift : gifts) {
            if (!gifters.contains(gift.getGiver()))
                gifters.add(gift.getGiver());
        }
        return gifters;
    }

    public String getGiftString() {
        String giftDesc = "";
        for (Gift gift : gifts) {
            giftDesc += gift.getDescription() + ", ";
        }
        return giftDesc;
    }

    public String toString() {
        return "\n" + name
//                "\nGifts: " + getGiftString() +
//                "\n---------------"
                ;
    }

}
