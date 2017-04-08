package com.jk.jdk.j2se.core.classes;

import com.jk.jdk.bean.BaseClass;
import com.jk.jdk.bean.DerivedClass;

public class ClassObjectEqualityDemo {

	public static void main(String[] args) {
		BaseClass A = new BaseClass();
		DerivedClass B = new DerivedClass();

		if (A.getClass() == B.getClass()) {
			System.out.println("A and B are instances of same class");
		} else {
			System.out.println("A and B are instances of different class");
		}
	}

}
