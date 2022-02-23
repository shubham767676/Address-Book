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

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		AddressBookMain addr = new AddressBookMain();
		addr.addPerson();

	}

}
