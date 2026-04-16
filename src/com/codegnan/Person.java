package com.codegnan;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		System.out.println(" parameterized constructor");
		this.name = name;
		this.age = age;
	}

	public Person() {
		
	}
	
	public Person(Person anotherPesron) {
		this.name= anotherPesron.name;
		this.age= anotherPesron.age;
	}
	
	public static void main(String[] args) {
		//defaul;t
		Person p1 = new Person();
		System.out.println("name : " + p1.name + " age " + p1.age);
		//parameters
		Person p2 = new Person("arjun", 30);
		System.out.println("name : " + p2.name + " age " + p2.age);
		// copy cosntructor
        Person p3=new Person(p1);
        System.out.println("name : " + p3.name + " age " + p3.age);
	}
}
