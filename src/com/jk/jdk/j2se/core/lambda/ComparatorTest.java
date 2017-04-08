package com.jk.jdk.j2se.core.lambda;

import java.util.Collections;
import java.util.List;

import com.jk.jdk.bean.Person;

import java.util.Comparator;

/**
 * @author MikeW
 */
public class ComparatorTest {

	public static void main(String[] args) {

		List<Person> personList = Person.createShortList();

		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getSurName().compareTo(arg1.getSurName());
			}

		});

		System.out.println("=== Sorted Asc SurName ===");
		for (Person p : personList) {
			p.printName();
		}

		Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));
		
		// Use Lambda instead

		for (Person p : personList) {
			p.printName();
		}

		// Print Desc
		System.out.println("=== Sorted Desc SurName ===");
		Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));

		for (Person p : personList) {
			p.printName();
		}

	}
}