package com.codegnan.java8;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String>print=s->System.out.println(s);
		print.accept("hello world");
		Consumer<Integer>square=n->System.out.println("square : "+(n*n));
		square.accept(7);
		Consumer<Employee>display=e->System.out.println("Employee : "
		+e.getName()+" Salary : "+e.getSalary());
		  Employee e1 = new Employee("Ravi", 55000);
	       Employee e2 = new Employee("Sita", 48000);
	       display.accept(e1);
	       display.accept(e1);

	}

}
