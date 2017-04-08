/**
 * 
 */
package com.jk.jdk.j2se.core.threading;

/**
 * @author Jitendra
 *
 */
public class HelloRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " - Hello Runnable");
	}
	
}
