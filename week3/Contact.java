package chap08.quiz.week3;

public class Contact {
	private final String name;
	private final String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String toString() {
		return "이름: " + name + ", 전화번호: " + phoneNumber;
	}
}
