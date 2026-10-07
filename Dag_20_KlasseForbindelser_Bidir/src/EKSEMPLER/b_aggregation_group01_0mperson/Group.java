package EKSEMPLER.b_aggregation_group01_0mperson;

import java.util.ArrayList;

public class Group {
	private String name;
	// aggregation: --> 0..* Person
	private final ArrayList<Person> persons = new ArrayList<>();

	public Group(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// -------------------------------------------------------------------------

	public ArrayList<Person> getPersons() {
		return new ArrayList<>(persons);
	}

	public Person createPerson(String personName) {
		Person person = new Person(personName);
		this.addPerson(person);
		return person;
	}

	/**
	 * Adds the person to this group,
	 * if they aren't connected
	 */
	public void addPerson(Person person) {
		if (!persons.contains(person)) {
			persons.add(person);
			person.setGroup(this);
		}
	}

	/**
	 * Removes the person from this group,
	 * if they are connected.
	 */
	public void removePerson(Person person) {
		if (persons.contains(person)) {
			persons.remove(person);
			person.setGroup(null);
		}
	}

}
