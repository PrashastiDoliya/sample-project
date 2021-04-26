package com.example.sampleproject.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableImpl {

	public void main() {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Vivek", 1, 29, "Engineer"));
		persons.add(new Person("Dhanya", 2, 53, "Doctor"));
		persons.add(new Person("Tejas", 3, 23, "Businessman"));
		persons.add(new Person("Nitin", 4, 28, "Scientist"));
		persons.add(new Person("Jatin", 5, 25, "Farmer"));
		persons.add(new Person("Parul", 6, 27, "Mechanic"));

		Collections.sort(persons);
		
		System.out.println("Sorted persons by name : ");
		for (Person person : persons) {
			System.out.println(person.name);
		}
		
	}
	
}
