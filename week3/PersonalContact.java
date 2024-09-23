package chap08.quiz.week3;

public class PersonalContact extends Contact {
	private final String relationship;

	public PersonalContact(String name, String phoneNumber, String relationship) {
		super(name, phoneNumber);
		this.relationship = relationship;
	}

	public String toString() {
		return super.toString() + ", 관계: " + relationship;
	}
}
