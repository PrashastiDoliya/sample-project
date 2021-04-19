package com.example.sampleproject.comparable;

public class Person implements Comparable<Person> {
	
	String name;
	int id;
	int age;
	String profession;
	
	public Person(String name, int id, int age, String profession) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.profession = profession;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	@Override
	public int compareTo(Person p) {
		return (this.name).compareTo(p.name);
	}
	
//	@Override
//	public int compareTo(Person p) {
//		return this.age - p.age;
//	}
	
}
