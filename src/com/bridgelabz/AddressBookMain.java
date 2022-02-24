package com.bridgelabz;

import java.util.LinkedList;
import java.util.Scanner;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);
	LinkedList<Contacts> person = new LinkedList<>();

	public void addPerson() {
		System.out.println("Enter the First Name");
		String fName = sc.next();
		System.out.println("Enter the Last Name");
		String lName = sc.next();
		System.out.println("Enter the Address");
		String address = sc.next();
		System.out.println("Enter the City");
		String city = sc.next();
		System.out.println("Enter the State");
		String state = sc.next();
		System.out.println("Enter the Zip");
		String zip = sc.next();
		System.out.println("Enter the PhoneNumber");
		String phoneNumber = sc.next();
		System.out.println("Enter the Email");
		String email = sc.next();

		Contacts con = new Contacts(fName, lName, address, city, state, zip, phoneNumber, email);
		person.add(con);
		System.out.println(con);
	}

	public void editPerson() {

		System.out.println("Enter the name to edit in contact");
		String firstName = sc.next();

		for (int i = 0; i < person.size(); i++) {
			Contacts con = person.get(i);
			if (firstName.equals(con.getFirstName())) {
				while (true) {
					System.out.print("Choice to edit \n1)FirstName\n2)LastName\n3)Address\n4)City\n5)State\n"
							+ "6)Zip\n7)PhoneNumber\n8)Email\n9)Exit");
					// if (firstName.equals(con.getFirstName())) {

					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						con.setFirstName(sc.next());
						break;
					case 2:
						con.setLastName(sc.next());
						break;
					case 3:
						con.setAddress(sc.next());
						break;
					case 4:
						con.setCity(sc.next());
						break;
					case 5:
						con.setState(sc.next());
						break;
					case 6:
						con.setZip(sc.next());
						break;
					case 7:
						con.setPhoneNumber(sc.next());
						break;
					case 8:
						con.setEmail(sc.next());
						break;
					default:
						System.out.println("Enter Valid Choice");
						break;
					}
					if (choice == 9)
						break;
				}
				person.set(i, con);
				System.out.println("Contact after Edit");
				System.out.println(person);

			}
		}
	}

	public void deletePerson() {
		System.out.println("Enter First Name to Delete");
		String firstName = sc.next();
//		Contacts temp = person.get(0);
		if (firstName.equals(person.get(0).getFirstName())) // checking for contact is present or not
		{
			System.out.println(person.get(0));// printing tha contacts
			person.remove(0);/// removing the contact
			System.out.println("Contact Deleted Successfully");
		} else {
			System.out.println("Invalid First Name");

		}
	}

	public void addMultiplePerson() {
		while (true) {
			System.out.println("Enter the option \n1)To Add Contact 2)To Edit Contact 3)To Delete Contact 4)Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1 -> addPerson();
			case 2 -> editPerson();
			case 3 -> deletePerson();
			case 4 -> System.out.println("Thank You for using Address Book");
			default -> System.out.println("Invalid option");
			}
			if (option == 4)
				break;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		AddressBookMain addr = new AddressBookMain();
//		addr.addPerson();
//		addr.editPerson();
//		addr.deletePerson();
		addr.addMultiplePerson();
	}

}
