package com.jk.jdk.j2se.core.lambda;

public class HelloLambda {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + " - Hello Parent");
		
/*		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " - Hello Runnable");
			}
			
		});
				
		t.start();*/
		
		Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName() + " - Hello Runnable"));
		thread.start();
	}
	
}
