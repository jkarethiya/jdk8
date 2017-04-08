package com.jk.jdk.j2se.core.optional;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {

		Optional<String> gender = Optional.of("MALE");
		String answer1 = "Yes";
		String answer2 = null;

		System.out.println("Non-Empty Optional:" + gender);
		System.out.println("Non-Empty Optional: Gender value : " + gender.get());
		System.out.println("Empty Optional: " + Optional.empty());

		System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
		System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

		Optional<String> o = Optional.ofNullable(answer2);
		System.out.println(o.get());
		
		
		// java.lang.NullPointerException
		//System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));

	}
}
