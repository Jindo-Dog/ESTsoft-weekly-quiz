package chap08.quiz.week2;

public class PersonalContact extends Contact {
	private final String relationship;

	public PersonalContact(String name, String phoneNumber, String relationship) {
		super(name, phoneNumber);
		this.relationship = relationship;
	}

	public String getRelationship() {
		return relationship;
	}
}
