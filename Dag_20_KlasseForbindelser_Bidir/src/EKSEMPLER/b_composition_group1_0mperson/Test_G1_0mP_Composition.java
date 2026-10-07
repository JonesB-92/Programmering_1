package EKSEMPLER.b_composition_group1_0mperson;

public class Test_G1_0mP_Composition {
	public static void main(String[] args) {
		Group g1 = new Group("G1");

		// Before: No connections
		// After: g1 <--> p1
		Person p1 = g1.createPerson("P1");

		System.out.println("Test 1:");
		System.out.println(g1.getPersons().contains(p1));
		System.out.println(p1.getGroup() == g1);

		// Before: g1 <--> p1
		// After: No connections
		g1.removePerson(p1);
		// NB: GC deletes p1 

		System.out.println("Test 2:");
		System.out.println(!g1.getPersons().contains(p1));
	}
}
