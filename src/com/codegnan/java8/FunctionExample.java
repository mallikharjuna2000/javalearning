package com.codegnan.java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer,Integer>findSquare=i->i*i;
		System.out.println(findSquare.apply(5));
       Function<String,Integer>length=s->s.length();
       System.out.println(length.apply("Mallikharjuna"));
       
	}

}
