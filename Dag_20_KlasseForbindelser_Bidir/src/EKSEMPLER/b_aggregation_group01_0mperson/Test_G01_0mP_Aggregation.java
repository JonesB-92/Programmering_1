package EKSEMPLER.b_aggregation_group01_0mperson;

public class Test_G01_0mP_Aggregation {

	public static void main(String[] args) {
		Group g1 = new Group("G1");
		Group g2 = new Group("G2");

		Person p1 = new Person("P1");
		Person p2 = new Person("P2");

		// Before: No connections
		// After: g1 -- p1, g2 -- p2
		g1.addPerson(p1);
		p2.setGroup(g2);

		System.out.println("Test 1:");
		System.out.println(g1.getPersons().contains(p1));
		System.out.println(p1.getGroup() == g1);
		System.out.println(g2.getPersons().contains(p2));
		System.out.println(p2.getGroup() == g2);

		// Before: g1 -- p1, g2 -- p2
		// After: g2 -- p1, p2
		// Please note, that p1 can't be connected to 2 groups.

		//g2.addPerson(p1);
		// or
		p1.setGroup(g2);

		System.out.println("Test 2:");
		System.out.println(!g1.getPersons().contains(p1));
		System.out.println(g2.getPersons().contains(p1));
		System.out.println(p1.getGroup() == g2);
		System.out.println(g2.getPersons().contains(p2));
		System.out.println(p2.getGroup() == g2);

		// Before: g2 -- p1 and p2
		// After: g2 -- p2
		//g2.removePerson(p1);
		// or
		p1.setGroup(null);

		System.out.println("Test 3:");
		System.out.println(!g2.getPersons().contains(p1));
		System.out.println(p1.getGroup() == null);
		System.out.println(g2.getPersons().contains(p2));
		System.out.println(p2.getGroup() == g2);

		// Test of createPerson()
		// Before: No connection to P3
		// After: g1 -- p3
		Person p3 = g1.createPerson("P3");

		System.out.println("Test 4:");
		System.out.println(g1.getPersons().contains(p3));
		System.out.println(p3.getGroup() == g1);
	}
}
