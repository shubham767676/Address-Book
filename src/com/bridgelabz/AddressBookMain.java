package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	static Scanner sc = new Scanner(System.in);

	public static void addressBook() {

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

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		addressBook();

	}

}