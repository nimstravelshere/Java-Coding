package com.operations;

import java.util.ArrayList;

import com.core.classes.Cricketer;
import java.util.*;

public class OperationsImplementation implements OperationsInterface {
	ArrayList<Cricketer> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCricketer() {
//		this.name = name;
//		this.age = age;
//		this.email_id = email_id;
//		this.phone = phone;
//		this.rating = rating;
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter age");

		int age = sc.nextInt();
		System.out.println("Enter email");

		String email = sc.next();
		System.out.println("Enter phoneno");

		String Phone = sc.next();
		System.out.println("Enter rating");

		int rating = sc.nextInt();
		Cricketer c = new Cricketer(name, age, email, Phone, rating);
		list.add(c);
	}

	@Override
	public void updateCricketer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchCricketer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayCricketer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sortCricketer() {
		// TODO Auto-generated method stub

	}

}
//1.Accept minimum 5 Cricketers in the collection.
//
//2.Modify Cricketer's rating
//
//3.Search Cricketer by name
//
//4. Display all Cricketers added in collection.
//
//5.Display All Cricketers in sorted form by rating.