package threadstatemonitoring;

import java.util.*;

 
public class ThreadStateMonitoringSystem {

	public static void main(String[] args) throws InterruptedException {

		 
		TaskRunner t1 = new TaskRunner("Task-1");
		TaskRunner t2 = new TaskRunner("Task-2");

	 
		List<Thread> threadList = Arrays.asList(t1, t2);

	 
		StateMonitor monitor = new StateMonitor(threadList);

		 
		monitor.start();

	 
		t1.start();
		t2.start();

		 
		t1.join();
		t2.join();

		 
		monitor.join();
	}
}