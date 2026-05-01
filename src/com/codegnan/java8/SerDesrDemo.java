package com.codegnan.java8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerDesrDemo {

	public static void main(String[] args) {
		System.out.println("Serialization started");
		String filepath="emp.ser";
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			 fos=new FileOutputStream(filepath);
			oos=new ObjectOutputStream(fos);
			Student s=new Student(101,"malli","malli@codegnan");
			System.out.println("Before serialization student details ");
			s.displayStudentDetails();
			oos.writeObject(s);
			System.out.println("Serailized Student Object : "+s);
			System.out.println("Serialization Endede");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
