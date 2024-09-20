package chap08.quiz.week2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		while (true) {
			System.out.println("1. 비즈니스 연락처 추가");
			System.out.println("2. 개인 연락처 추가");
			System.out.println("3. 연락처 출력");
			System.out.println("4. 연락처 검색");
			System.out.println("5. 종료");
			System.out.print("메뉴를 선택하세요: ");
			Scanner scanner = new Scanner(System.in);
			switch (scanner.next()) {
				case "1" -> {
					System.out.print("이름을 입력하세요: ");
					String name = scanner.next();
					System.out.print("전화번호를 입력하세요: ");
					String phoneNumber = scanner.next();
					System.out.print("회사명을 입력하세요: ");
					String company = scanner.next();

					addressBook.addContact(new BusinessContact(name, phoneNumber, company));
				}
				case "2" -> {
					System.out.print("이름을 입력하세요: ");
					String name = scanner.next();
					System.out.print("전화번호를 입력하세요: ");
					String phoneNumber = scanner.next();
					System.out.print("관계를 입력하세요: ");
					String relation = scanner.next();

					addressBook.addContact(new PersonalContact(name, phoneNumber, relation));
				}
				case "3" -> addressBook.displayContacts();
				case "4" -> {
					System.out.print("검색할 이름을 입력하세요: ");
					addressBook.searchContact(scanner.next());
				}
				case "5" -> {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				default -> System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
