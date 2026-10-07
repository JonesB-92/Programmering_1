package Employee;

/*
 * Anvendelses program der opretter Employee objekter og anvender metoder på disse
 */
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee("Hans Jensen", 82);
		e1.setAge(14);
		e1.printEmployee();
		e1.setFirstName("Viggo");
		e1.printEmployee();

		System.out.println("Her er e1 " + e1);

		Employee e2 = new Employee("Ole Jensen", 34);
		e2.printEmployee();
		e2.birthday();
		e2.printEmployee();

		System.out.println(e2);

	}

}
