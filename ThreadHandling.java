package com;

@CopyRight
public class ThreadHandling {

	private String java = "Java";

	private String unix = "Unix";

	Thread t1 = new Thread("Thread1") {
		public void run() {
			synchronized (unix) {
				System.out.println(t1.getName() + " -> " + t1.getState() + " -> " + unix);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	};

	Thread t2 = new Thread("Thread2") {
		public void run() {
			synchronized (java) {
				System.out.println(t2.getName() + " -> " + t2.getState() + " -> " + java);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	};

	Thread t3 = new Thread("Thread3") {
		public void run() {
			synchronized (unix) {
				unix = "Ubuntu";
				System.out.println(t3.getName() + " -> " + t3.getState() + " -> " + unix);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	};

	Thread t4 = new Thread("Thread4") {
		public void run() {
			synchronized (unix) {
				unix = "BackTrack5";
				System.out.println(t4.getName() + " -> " + t4.getState() + " -> " + unix);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	public static void main(String[] args) {
		ThreadHandling t = new ThreadHandling();
		t.t1.start();
		t.t2.start();
		t.t3.start();
		t.t4.start();
	}

}
