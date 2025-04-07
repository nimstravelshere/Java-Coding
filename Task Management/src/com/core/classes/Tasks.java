package com.core.classes;

import java.time.LocalDate;
import java.util.Objects;

public class Tasks {
	static private int taskCounter = 0;
	private int taskid;
	String taskName;
	String taskDescription;
	LocalDate taskdate;
	boolean active;
	Status curr;

	public Tasks(String taskName, String taskDescription, LocalDate localDate, boolean b) {
		super();
		this.taskid = ++taskCounter;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.taskdate = localDate;
		this.active = true;
		this.curr = Status.PENDING;
	}

	public Tasks(int id) {
		this.taskid = id;
	}

	@Override
	public String toString() {
		return "Tasks [taskid=" + taskid + ", taskName=" + taskName + ", taskDescription=" + taskDescription
				+ ", taskdate=" + taskdate + ", active=" + active + ", curr=" + curr + "]";
	}

	public static int getTaskCounter() {
		return taskCounter;
	}

	public static void setTaskCounter(int taskCounter) {
		Tasks.taskCounter = taskCounter;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public LocalDate getTaskdate() {
		return taskdate;
	}

	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Status getCurr() {
		return curr;
	}

	public void setCurr(Status curr) {
		this.curr = curr;
	}



}
