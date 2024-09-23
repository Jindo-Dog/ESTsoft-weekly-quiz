package chap08.quiz.week3;

public class BusinessContact extends Contact {
	private final String company;

	public BusinessContact(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	public String toString() {
		return super.toString() + ", 회사명: " + company;
	}
}
