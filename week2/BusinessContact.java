package chap08.quiz.week2;

public class BusinessContact extends Contact {
	private final String company;

	public BusinessContact(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}
}
