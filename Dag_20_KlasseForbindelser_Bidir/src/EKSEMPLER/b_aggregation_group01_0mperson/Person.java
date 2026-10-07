package EKSEMPLER.b_aggregation_group01_0mperson;

public class Person {
	private String name;
	// aggregation: --> 0..1 Group
	private Group group;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	// -------------------------------------------------------------------------

	public Group getGroup() {
		return group;
	}

	/**
	 * Sets the group as this person's group, if they aren't connected. 
	 */
	public void setGroup(Group group) {
		if (this.group != group) {
			Group oldGroup = this.group;
			if (oldGroup != null) {
				oldGroup.removePerson(this);
			}
			this.group = group;
			if (group != null) {
				group.addPerson(this);
			}
		}
	}

	
}
