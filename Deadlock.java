package com;

@CopyRight
class TestUtil {
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

@CopyRight
class Shared {

	synchronized void resource1(Shared s2) {
		System.out.println("resource1() started.");
		TestUtil.sleep(2000);
		s2.resource2(this);
		System.out.println("resource1() ended.");
	}

	synchronized void resource2(Shared s1) {
		System.out.println("resource2() started.");
		TestUtil.sleep(2000);
		s1.resource1(this);
		System.out.println("resource2() ended.");
	}
}

@CopyRight
public class Deadlock {

	Shared s1, s2;

	Deadlock(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	Thread t1 = new Thread() {
		public void run() {
			s1.resource1(s2);
		};
	};

	Thread t2 = new Thread() {
		public void run() {
			s2.resource2(s1);
		};
	};

	public static void main(String[] args) {
		Deadlock t = new Deadlock(new Shared(), new Shared());
		t.t1.start();
		t.t2.start();
	}
}
