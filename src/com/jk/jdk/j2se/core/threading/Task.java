package com.jk.jdk.j2se.core.threading;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}