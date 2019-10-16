package com;

@CopyRight
public class IterationWOUsingLoops {
	int i = 0;

	public void woFor() {
		System.out.print(++i + " ");
		if (i != 1000) {
			woFor();
		}
	}

	public static void main(String[] args) {
		IterationWOUsingLoops t = new IterationWOUsingLoops();
		long woForStartTime = Utils.getInstance().startTimer();
		t.woFor();
		long woForEndTime = Utils.getInstance().endTimer();
		long woForTotalTime = woForEndTime - woForStartTime;
		System.out.println("\nW/O For Loop Total Execution Time: " + woForTotalTime + " milli seconds");
	}
}
