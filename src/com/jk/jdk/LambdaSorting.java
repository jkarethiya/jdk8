/**
 * 
 */
package com.jk.jdk;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jk.jdk.bean.Developer;

/**
 * @author Jitendra
 *
 */
public class LambdaSorting {
	
	public static void main(String[] args) {
		List<Developer> developers = Developer.getDevelopers();
		
		System.out.println("Before Sort");
		
		for(Developer developer : developers) {
			System.out.println(developer);
		}
		
		Collections.sort(developers, new Comparator<Developer>() {
			public int compare(Developer d1, Developer d2) {
				return d1.getId() - d2.getId();
			}
		});
		
		System.out.println("After Sort");
		
		for(Developer developer : developers) {
			System.out.println(developer);
		}
	}

}
