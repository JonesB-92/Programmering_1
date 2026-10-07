package Employee;

/**
 * Klasse der beskriver en ansat
 *
 * @author mad
 */
public class Employee {
    /*
     * Attributter der beskriver den ansattes tilstand
     */
    private String firstName;
    private String lastName;
    private boolean trainee;
    //b) Tilføj til klassen Employee en attribut age af typen int.
    private int age;

    /*
     * Constructor, når den ansatte oprettes, skal den have et navn. Ved
     * oprettelse er den ansatte en trainee
     */
    public Employee(String inputName, int age) {
        firstName = inputName;
        trainee = true;
        this.age = age;

    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //c) Tilføj til klassen Employee metoden getAge(), der returner den ansattes
    //alder.
    public int getAge() {
        return age;
    }

    //d) Tilføj til klassen Employee metoden setAge(int age), der giver den ansatte
    //en ny alder.
    public void setAge(int age) {
        this.age = age;
    } //"this." dette for at få fat i variablen uden for metoden oppe i objektet "employee" og ikke "age"

    public void birthday() {
        this.age++;
    }


    /*
     * Den ansattes navn kan ændres ved kald af setName metoden
     */
    public void setFirstName(String inputName) {
        firstName = inputName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*
     * Man kan få oplyst den ansattes navn, ved at kalde metoden getName
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /*
     * Den ansatte kan få ændret trainee status ved at kalde metoden setTrainess
     */
    public void setTrainee(boolean isTrainee) {
        trainee = isTrainee;
    }

    /*
     * Man kan få oplyst den ansatte er trainess aktivitet, ved at kalde metoden
     * isTrainee
     */
    public boolean isTrainee() {
        return trainee;
    }

    public void printEmployee() {
        System.out.println("*******************");
        System.out.println("First name " + firstName);
        System.out.println("Last name " + lastName);
        System.out.println("Full name " + firstName + " " + lastName);
        System.out.println("Trainee " + trainee);
        System.out.println("Age " + age);
        System.out.println();
    }


    /*
     * Returnerer en kort tekst repræsentation af objektet
     */
	/*public String toString(){
		return firstName + lastName;
	}*/
}
