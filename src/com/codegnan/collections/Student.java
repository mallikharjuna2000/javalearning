package com.codegnan.collections;

import java.util.Objects;

public class Student {
	 int id;
	 String name;
	 int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
