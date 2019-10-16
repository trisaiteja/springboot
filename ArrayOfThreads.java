package com;

@CopyRight
public class ArrayOfThreads implements Runnable{
	
	public static void test(Thread[] tArr) {
		for (int i = 0; i < tArr.length; i++) {
			try {
				System.out.println("Thread name: "+Thread.currentThread()+"a[" + i + "]: " + tArr[i]);
				Thread.sleep(3000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		ArrayOfThreads t1 = new ArrayOfThreads();
		ArrayOfThreads t2 = new ArrayOfThreads();
		ArrayOfThreads t3 = new ArrayOfThreads();
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		Thread tt3 = new Thread(t3);
		
		Thread[] tArr = new Thread[] {tt1, tt2, tt3};
		test(tArr);
	}
	
	public static void main(String[] args) {
		Thread tt4 = new Thread(new ArrayOfThreads());
		tt4.start();
	}

}
