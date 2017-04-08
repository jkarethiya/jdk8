package com.jk.jdk.j2se.core.wrapperclasses;

public class IntegerObjectEqualityTest {

	public static void main(String[] args) {
		Integer i1 = 260;
		Integer i2 = 260;

		if (i1 == i2) {
			System.out.println("i1 and i2 is equal");
		} else {
			System.out.println("i1 and i2 is not equal ");
		}
		
		i1 = -128;
		i2 = -128;

		if (i1 == i2) {
			System.out.println("i1 and i2 is equal");
		} else {
			System.out.println("i1 and i2 is not equal ");
		}

		
		i1 = 127;
		i2 = new Integer(127);

		if (i1 == i2) {
			System.out.println("i1 and i2 is equal");
		} else {
			System.out.println("i1 and i2 is not equal ");
		}

	}

}
