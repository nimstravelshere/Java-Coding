package com.core.operations;

import java.time.LocalDate;

public interface OperationsInterface {
	void addtask();
	void updatetask(int taskId,String taskDescription);
	void deletetask(int taskid);
	void displayalltaskpending();
	void displaytodaytask();
}
