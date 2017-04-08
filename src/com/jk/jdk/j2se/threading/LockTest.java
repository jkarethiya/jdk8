package com.jk.jdk.j2se.threading;

public class LockTest {

	public final Object LOCK = new Object();

	public static void main(String[] args) throws Exception {
		LockTest l = new LockTest();
		l.execute();

	}

	public void execute() throws Exception {
		Thread t1 = new Thread(new RunnableImpl1(LOCK));
		Thread t2 = new Thread(new RunnableImpl2(LOCK));
		
		
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

}

class RunnableImpl1 implements Runnable {

	public Object LOCK;

	public RunnableImpl1(Object LOCK) {
		this.LOCK = LOCK;
	}

	@Override
	public void run() {
		System.out.println("RunnableImpl1 - " + Thread.currentThread().getName());

		try {
			Thread.currentThread().wait();
		} catch (Exception e1) {
			System.out.println("Exception" + Thread.holdsLock(LOCK));
		}
		
		synchronized (LOCK) {
			try {
				System.out.println("RunnableImpl2" + Thread.holdsLock(LOCK));
				
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class RunnableImpl2 implements Runnable {

	public Object LOCK;

	public RunnableImpl2(Object LOCK) {
		this.LOCK = LOCK;
	}

	@Override
	public void run() {
		
	}

}