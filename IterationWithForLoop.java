package com;

@CopyRight
public class IterationWithForLoop {

	public void wFor() {
		for (int i = 1; i <= 1000; i++) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		IterationWithForLoop t = new IterationWithForLoop();
		long wForStartTime = Utils.getInstance().startTimer();
		t.wFor();
		long wForEndTime = Utils.getInstance().endTimer();
		long totalTime = wForEndTime - wForStartTime;
		System.out.println("\nWith For Loop Total Execution time: " + totalTime + " milli seconds");
	}
}
