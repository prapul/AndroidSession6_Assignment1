package prapul;

import java.util.Timer;
import java.util.TimerTask;

public class AndrodSession6_Assignment extends TimerTask implements Runnable{
	public void run() {
	       System.out.println("Beep! Beep!"); 
	    }
	public static void main(String args[]){
	Timer timer = new Timer();
	timer.schedule(new AndrodSession6_Assignment(), 0, 5000);
	}
}
