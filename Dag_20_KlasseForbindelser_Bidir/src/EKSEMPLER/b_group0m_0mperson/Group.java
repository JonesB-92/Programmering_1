package EKSEMPLER.b_group0m_0mperson;

import java.util.ArrayList;

public class Group {
	private String name;
	// association: --> 0..* Person
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

	/**
	 * Adds the person to this group and the group to the person,
	 * if they aren't connected.
	 */
	public void addPerson(Person person) {
		if (!persons.contains(person)) {
			persons.add(person);
			person.addGroup(this);
		}
	}

	/**
	 * Removes the person from this group and the grop from the person,
	 * if they are connected.
	 */
	public void removePerson(Person person) {
		if (persons.contains(person)) {
			persons.remove(person);
			person.removeGroup(this);
		}
	}
}
