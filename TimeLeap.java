import java.io.IOException;
import java.util.Scanner;

public class TimeLeap {

	public static void main(String[] args) throws InterruptedException {
		Timer x = new Timer();
		while (true) {
			x.increase();
			Thread.sleep(1000);
			System.out.format("%02d:%02d:%02d%n", x.getHour(), x.getMinute(), x.getSecond());
		}
	}

}

class Timer {
	private int hour;
	private int minute;
	private int second;

	public Timer() {
		Scanner sc = new Scanner(System.in);
		int h, m, s;
		System.out.print("Set Hour : ");
		h = sc.nextInt();
		System.out.print("Set Minute : ");
		m = sc.nextInt();
		System.out.print("Set Second : ");
		s = sc.nextInt();
		setHour(h);
		setMinute(m);
		setSecoud(s);
	}

	public void setHour(int h) {
		hour = h;
	}

	public void setMinute(int m) {
		minute = m;
	}

	public void setSecoud(int s) {
		second = s;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void increase() {
		second++;
		if (second >= 60) {
			second = 0;
			minute++;
		}
		if (minute >= 60) {
			minute = 0;
			hour++;
		}
		if (hour >= 24) {
			hour = 0;		
		}
		
	}

}
