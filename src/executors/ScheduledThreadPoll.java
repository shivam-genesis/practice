package executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoll {

	public static void main(String[] args) {
		// for scheduling of tasks
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		// task to run after 10 second delav
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		// task to run repeatedly every 10 seconds
		service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
		
		// task to run repeatedly 10 seconds after previous task completes
		service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);
	}

	static class Task implements Runnable {
		public void run() {
		}
	}
}
