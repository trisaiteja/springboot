package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@CopyRight
public class ThreadExample3 {
	
	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1();
		ThreadExample2 t2 = new ThreadExample2();
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(t1);
		service.execute(t2);
	}
	
}
