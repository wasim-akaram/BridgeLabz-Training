package printingJob;


class PrintJob implements Runnable {

	private String jobName;
	private int pages;
	private String priorityTag; 


	public PrintJob(String jobName, int pages, String priorityTag) {
		this.jobName = jobName;
		this.pages = pages;
		this.priorityTag = priorityTag;
	}


	@Override
	public void run() {

	
		for (int i = 1; i <= pages; i++) {
			System.out.println("[" + priorityTag + "] Printing " + jobName + " - Page " + i + " of " + pages);
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				System.out.println(jobName + " interrupted");
			}
		}
	}
}