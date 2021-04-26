package com.example.sampleproject.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.sampleproject.comparable.Person;

public class ComparatorImpl {

	public void main() {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Vivek", 1, "Pune", 246));
		employees.add(new Employee("Dhanya", 2, "Gandhinagar", 2464));
		employees.add(new Employee("Tejas", 3, "Mumbai", 247));
		employees.add(new Employee("Nitin", 4, "Nashik", 2262));
		employees.add(new Employee("Jatin", 5, "Indore", 976));
		employees.add(new Employee("Arun", 6, "Bhopal", 5634));

		Collections.sort(employees, new SortByName());

		System.out.println("Sorted Objects by name : ");
		for (Employee employee : employees) {
			System.out.println(employee.name);
		}
		
		Collections.sort(employees, new SortById());

		System.out.println("Sorted Objects by id : ");
		for (Employee employee : employees) {
			System.out.println(employee.id);
		}
		
		Collections.sort(employees, new SortByAddress());

		System.out.println("Sorted Objects by address : ");
		for (Employee employee : employees) {
			System.out.println(employee.address);
		}
		
		Collections.sort(employees, new SortBySalary());

		System.out.println("Sorted Objects by salary : ");
		for (Employee employee : employees) {
			System.out.println(employee.salary);
		}
	}

}
