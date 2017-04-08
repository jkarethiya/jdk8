package com.jk.jdk.j2se.core;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class ParallelTestClasses {
	
	public static long startTime;

	@BeforeClass
	public static void beforeClass() {
		startTime = System.currentTimeMillis();
	}
	
	@Test
	public void test1() {
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		
		System.out.println("Test 3");
	}
	
	@Test
	public void test4() {		
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

		System.out.println("Test 4");
	}
	
	@Test
	public void test5() {
		try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }

		System.out.println("Test 5");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Execution completed in " + (System.currentTimeMillis() - startTime + "ms"));
	}
}
