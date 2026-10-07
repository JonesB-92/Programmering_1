package PersonEksempel;

public class PersonApp {

    public static void main(String[] args) {
        Person person1 = new Person ("Anders Matthesen", "FBV 100", 34000);

        System.out.println();
        System.out.println(person1.getName());
        System.out.println(person1.getAddress());
        System.out.println(person1.getMonthlySalary());

        person1.printPerson();

        System.out.println(person1.annualSalaryCalculator());
        System.out.println();
        System.out.println(person1.getNumberOfWorkplaces());
        person1.newEmployment();
        System.out.println(person1.getNumberOfWorkplaces());

    }
}
