package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	ArrayList<Contacts> person = new ArrayList<Contacts>();
	static Scanner sc = new Scanner(System.in);

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

		Contacts temp = person.get(0); // transfer from addressbook to temp new variable
		System.out.println(temp);
		System.out.println("Enter the name to edit in contact");
		String s = sc.next();

		if (s.equals(temp.getFirstName())) {
			System.out.print("Choice to edit \n1)FirstName\n2)LastName\n3)Address\n4)City\n5)State\n"
					+ "6)Zip\n7)PhoneNumber\n8)Email\n9)Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 -> temp.setFirstName(sc.next());
			case 2 -> temp.setLastName(sc.next());
			case 3 -> temp.setAddress(sc.next());
			case 4 -> temp.setCity(sc.next());
			case 5 -> temp.setState(sc.next());
			case 6 -> temp.setZip(sc.next());
			case 7 -> temp.setPhoneNumber(sc.next());
			case 8 -> temp.setEmail(sc.next());
			case 9 -> {
				System.out.println("Exiting");
				break;
			}
			}

		} else {
			System.out.println("Your name is not present in Contact");
		}
		System.out.println("After Editing the Contact");
		person.set(0, temp); // storing back from temp variable to addressbook
		System.out.println(person);

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

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		AddressBookMain addr = new AddressBookMain();
		addr.addPerson();
		addr.editPerson();
		addr.deletePerson();
	}

}
