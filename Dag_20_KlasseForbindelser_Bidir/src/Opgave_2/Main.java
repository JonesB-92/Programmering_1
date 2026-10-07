package Opgave_2;

public class Main {

    public static void main(String[] args) {

//    d. Lav en afprøvningsklasse, hvor du opretter nogle gaver og personer, og dernæst lader
//    personerne modtage disse gaver. Afprøv dernæst metoden fra delopgave c).

        Person person = new Person("Jones", 22);
        Person person1 = new Person("Oliver 0-1 til kantsten", 45);
        Person person2 = new Person("MåtMåt/Morten", 17);

        //Jonas' gaver
        Gift gift = new Gift("PS5");
        Gift gift0 = new Gift("RTX 4090");
        Gift gift1 = new Gift("Diablo 2: Resurrected");
        person.addGift(gift);
        person.addGift(gift0);

        //Oliver gaver
        Gift gift2 = new Gift("Lighter");
        Gift gift3 = new Gift("Batteri");
        Gift gift4 = new Gift("Lampe");
        person1.addGift(gift2);
        person1.addGift(gift3);
        person1.addGift(gift4);
        Gift gift5 = new Gift("Lottobillet");
        Gift gift6 = new Gift("BLomster");
        gift5.setPrice(1500.95);
        gift6.setPrice(2000.95);

        System.out.println(person.getName() + ": " + person.getGiftString());
        System.out.println("---------------");
        System.out.println(person1.getName() + ": " + person1.getGiftString());
        System.out.println("---------------");

        //Tjek totalGiftPrice()
        gift.setPrice(2399.99);
        gift0.setPrice(10299.95);

        gift2.setPrice(999.99);
        gift3.setPrice(550.50);
        gift4.setPrice(50499.99);

        System.out.println("\nJonas' gavers pris: " + person.totalGiftPrice());
        System.out.println("Olivers ønskelistes pris: " + person1.totalGiftPrice());

        System.out.println("\n" + person.getGifters());
        System.out.println(person1.getGifters()); //Null fordi de ikke har fået gaver fra nogen Person endnu

        person.giveGift(gift, person);
        person.giveGift(gift0, person);
        person.giveGift(gift1, person);

        person2.giveGift(gift2, person1);
        person2.giveGift(gift3, person1);
        person2.giveGift(gift4, person1);

        person1.giveGift(gift5, person2);
        person1.giveGift(gift6, person2);

        System.out.println("------------------");
        System.out.println("Jonas har modtaget gaver fra: " + person.getGifters());
        System.out.println("Oliver har modtaget gaver fra: "  +person1.getGifters());
        System.out.println("Måtmåt har modtaget gaver fra: " + person2.getGifters());

        Gift gift7 = new Gift("Kaffekande fra kantinen");
        gift7.setPrice(30);

        person2.giveGift(gift7, person);
        System.out.println(person + " har modtaget fra " + person.getGifters());

        Gift gift8 = new Gift("Tandbørste");
        gift7.setPrice(20);
        person.giveGift(gift8, person1);
        person.giveGift(gift8, person2);

        Gift gift9 = new Gift("Jagtgevær");
        person1.giveGift(gift9, person);
        System.out.println("\n" + person.getName() + " har modtaget gave fra " + person.getGifters() + ". Gaverne: " + person.getGiftString());
        System.out.println("\n" + person1.getName() + " har modtaget gave fra " + person1.getGifters() + ". Gaverne: " + person1.getGiftString());
        System.out.println("\n" + person2.getName() + " har modtaget gave fra " + person2.getGifters() + ". Gaverne: " + person2.getGiftString());
    }

}
