package EKSEMPLER.b_composition_group1_0mperson;

import java.util.ArrayList;

public class Group {
	private String name;
	// composition: --> 0..* Person
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
		Person person = new Person(personName, this);
		persons.add(person);
		return person;
	}

	public void removePerson(Person person) {
		if (persons.contains(person)) {
			persons.remove(person);
		}
	}
}
