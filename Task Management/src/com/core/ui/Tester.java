package com.core.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.core.operations.OperationsImplementation;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OperationsImplementation op = new OperationsImplementation();
		System.out.println("1. Add Task");
		System.out.println("2. Delete Task by taskid and taskname");
		System.out.println("3. Update Task Status");
		System.out.println("4. Display All pending Task");
		System.out.println("5. Display all pending Todays Task");
		boolean exit = false;
		while (!exit) {
			switch (sc.nextInt()) {
			case 1:
				op.addtask();
				break;
			case 2:
				op.deletetask(sc.nextInt());
				break;
			case 3:
				op.updatetask(sc.nextInt(), sc.next());	
				break;	
			case 4:
				op.displayalltaskpending();
				break;
			case 5:
				op.displaytodaytask();
				break;				
			default:
				System.out.println("Out of Console");
				break;
			}
		}
	}
}
