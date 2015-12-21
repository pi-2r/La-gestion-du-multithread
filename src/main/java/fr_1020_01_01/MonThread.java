package fr_1020_01_01;

public class MonThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Execution du Thread MonThread Runnable");
		}
	}
}
