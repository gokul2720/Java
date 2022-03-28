package com.gp.day7.exception;

public class Exercise extends Thread {

	int max;

	public Exercise(int max) {
		this.max = max;
	}

	@Override
	public void run() {
		while (max > 0) {
			if (max % 2 == 0) {
				System.out.println(max);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}
			}
			max--;
		}

	}

	public static void main(String[] args) {
		Exercise exercise = new Exercise(10);
		exercise.start();
		Exercise exercise1 = new Exercise(20);
		exercise1.start();

	}
}
