package com.lambda.expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UnitExsetice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
				new Person("Abhi", "gupta", 28),
				new Person("Shyam", "aupta", 47)
				);
		
		
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		System.out.println("Print all person..");
		
		printContinially(people,p -> true, p -> System.out.println(p));
		
		printContinially(people,p -> p.getFirstName().startsWith("S"),p -> System.out.println( " With first name " + p));
		
		printContinially(people,p -> p.getLastName().startsWith("g"),p -> System.out.println( " With last name " + p));
		
	}

	private static void printContinially(List<Person> people, Predicate<Person> predicate , Consumer<Person> consumer) {
		for(Person p : people){
			if(predicate.test(p)) {
				consumer.accept(p);
			}
			
		}
		
	}

}

