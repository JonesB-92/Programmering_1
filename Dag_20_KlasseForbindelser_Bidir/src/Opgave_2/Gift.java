package Opgave_2;

public class Gift {
    private String description;
    private double price;
    private Person giver;

    public Gift(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    //f. Tilføj nu en metode, der returnerer de personer, en person modtager gaver fra.
    public void setGiver(Person giver) {
        this.giver = giver;
    }
    public Person getGiver() {
        return this.giver;
    }

}
