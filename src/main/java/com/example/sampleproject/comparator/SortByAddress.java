package com.example.sampleproject.comparator;

import java.util.Comparator;

public class SortByAddress implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.address.compareToIgnoreCase(o2.address);
	}

}
