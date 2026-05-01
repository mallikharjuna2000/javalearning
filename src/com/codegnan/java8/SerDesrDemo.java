package com.codegnan.java8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesrDemo {

	public static void main(String[] args) {
		System.out.println("Serialization started");
		String filepath = "emp.ser";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(filepath);
			oos = new ObjectOutputStream(fos);
			Student s = new Student(101, "malli", "malli@codegnan","malli123");
			System.out.println("Before serialization student details ");
			s.displayStudentDetails();
			oos.writeObject(s);
			System.out.println("Serailized Student Object : " + s);
			System.out.println("Serialization Endede");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("De-Serialization started");
		try (FileInputStream fis = new FileInputStream(filepath); 
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Student s2 = (Student) ois.readObject();
			System.out.println("Student details after Deserailization ");
			s2.displayStudentDetails();
			System.out.println("De-Serialized Object : " + s2);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
