package PersonEksempel;

public class Person {
    //c. Programmer klassen Person, med ovenfor givne attributter og metoder
    //Attributer
    private String name;
    private String address;
    private double monthlySalary;
    private int numberOfWorkplaces = 0;


    //CONSTRUCTOR!!
    public Person(String name, String address, double monthlySalary) {
        this.name = name;
        this.address = address;
        this.monthlySalary = monthlySalary;
    }

    //Metoder
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    /* f. Udvid Person-klassen, så den indeholder en metode, der ud fra månedsløn
    beregner personens årsløn (12 gange månedslønnen + 2,5% i feriepenge). */
    public double annualSalaryCalculator() {
        return (monthlySalary * 12) + (monthlySalary * 0.025);
    }

    /* g. Udvid Person klassen, så den også indeholder information om antal
    virksomheder, som personen har været ansat i. Det skal være muligt via en
    metode, at registrere at personen ansættes i et nyt firma. */
    public void setNumberOfWorkplaces(int numberOfWorkplaces) {
        this.numberOfWorkplaces = numberOfWorkplaces;
    }

    //ELLER
    public void newEmployment() {
        numberOfWorkplaces++;
    }

    public int getNumberOfWorkplaces() {
        return numberOfWorkplaces;
    }


    /* e. Tilføj en public void printPerson() metode til Person-klassen, der
    udskriver personens navn, adresse og månedsløn. */
    public void printPerson() {
        System.out.println();
        System.out.println(name);
        System.out.println(address);
        System.out.println(monthlySalary);
    }
}
