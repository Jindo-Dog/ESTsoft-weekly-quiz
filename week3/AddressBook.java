package chap08.quiz.week3;

import java.util.*;

public class AddressBook {
	List<Contact> contacts = new ArrayList<>();

	public void addContact(Contact contact) {
		for (Contact c : contacts) {
			if (c.getName().equals(contact.getName())) {
				System.out.println("이미 존재하는 이름입니다.");
				return;
			}
		}
		contacts.add(contact);
	}

	public void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("연락처가 비어 있습니다.");
			return;
		}
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}

	public void searchContact(String name) {
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
				System.out.println(contact);
				return;
			}
		}
		System.out.println("연락처를 찾을 수 없습니다.");
	}
}
