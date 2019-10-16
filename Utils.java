package com;

@CopyRight
public class Utils {

	private static Utils instance = new Utils();

	private Utils() {
	}

	public static Utils getInstance() {
		synchronized (instance) {
			if (instance != null) {
				return instance;
			} else {
				return new Utils();
			}
		}
	}

	public long startTimer() {
		return calcTime();
	}

	public long endTimer() {
		return calcTime();
	}

	public long calcTime() {
		return System.currentTimeMillis();
	}
}
