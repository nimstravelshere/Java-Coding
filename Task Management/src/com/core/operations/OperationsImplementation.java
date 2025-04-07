package com.core.operations;

import java.util.*;

import com.core.classes.Status;
import com.core.classes.Tasks;

import java.time.LocalDate;
import java.util.*;

public class OperationsImplementation implements OperationsInterface {
	Scanner sc = new Scanner(System.in);
	ArrayList<Tasks> TaskContainer = new ArrayList<>();

	@Override
	public void addtask() {
		// TODO Auto-generated method stub
		System.out.println("Enter Task Name");
		System.out.println("Enter Task Description");
		System.out.println("Enter Task Date");
		System.out.println("Enter Task Status");
		Tasks temp = new Tasks(sc.next(), sc.next(), LocalDate.parse(sc.next()), sc.nextBoolean());
		TaskContainer.add(temp);
		System.out.println("Task added");
	}

	@Override
	public void updatetask(int taskId, String taskDescription) {
		// TODO Auto-generated method stub
		for (Tasks t : TaskContainer) {
			if (t.getTaskid() + 1 == taskId) {
				t.setTaskdate(taskdate);
				t.setTaskDescription(taskDescription);
				t.setTaskName(taskDescription);
				t.setTaskid(taskId);

			}
		}

	}

	@Override
	public void displayalltaskpending() {
		// TODO Auto-generated method stub
		for (Tasks t : TaskContainer) {
			if (t.getCurr().equals(Status.PENDING) && t.isActive() == true) {
				System.out.println(t);

			}
		}

	}

	@Override
	public void displaytodaytask() {
		// TODO Auto-generated method stub
		for (Tasks t : TaskContainer) {
			if (t.getTaskdate() == LocalDate.now()) {
				System.out.println(t);
			}
		}
	}

	@Override
	public void deletetask(int taskid) {
		Tasks t = new Tasks(taskid);
		for (Tasks o : TaskContainer) {
			if (t.getTaskid() == o.getTaskid()) {
				t.setActive(false);
			}

		}
		System.out.println("Task Removed");
	}

}
