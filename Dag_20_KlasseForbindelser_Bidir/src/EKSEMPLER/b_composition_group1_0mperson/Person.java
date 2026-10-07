package EKSEMPLER.b_composition_group1_0mperson;

public class Person {
	private String name;
	// composition: --> 1 Group
	private Group group;

	Person(String name, Group group) { // package visibility
		this.name = name;
		this.group = group;
	}

	@Override
	public String toString() {
		return name;
	}

	// -------------------------------------------------------------------------

	public Group getGroup() {
		return group;
	}
}
