package com.annotations.bugReport;

public class SoftwareModule 
{
	@BugReport(description = "Fix NullPointer on startup")
	@BugReport(description = "Optimize memory usage")
	public void feature() {
		System.out.println("Running Feature");
	}
}