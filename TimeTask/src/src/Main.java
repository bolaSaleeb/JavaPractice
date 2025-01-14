package src;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static void main(String[] args) {
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Task is complete");
			}
			
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2020);
		date.set(Calendar.MONTH, Calendar.OCTOBER);
		date.set(Calendar.DAY_OF_MONTH, 16);
		date.set(Calendar.HOUR_OF_DAY, 0);
		date.set(Calendar.MINUTE, 0);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
		timer.schedule(task, date.getTime());
		
//		timer.schedule(task, 3000);
	}
}
