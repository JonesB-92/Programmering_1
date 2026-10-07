package EKSEMPLER.b_group0m_0mperson;

import java.util.ArrayList;

public class Person {
	private String name;
	// association: --> 0..1 Group
	private final ArrayList<Group> groups = new ArrayList<>();

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// -------------------------------------------------------------------------

	public ArrayList<Group> getGroups() {
		return new ArrayList<Group>(groups);
	}

	/**
	 * Adds the group to this person and the person to the group,
	 * if they aren't connected
	 */
	public void addGroup(Group group) {
		if (!groups.contains(group)) {
			groups.add(group);
			group.addPerson(this);
		}
	}	
	
	/**
	 * Removes the group from this person and the person from the group,
	 * if they are connected
	 */
	public void removeGroup(Group group) {
		if (groups.contains(group)) {
			groups.remove(group);
			group.removePerson(this);
		}
	}

	
}
