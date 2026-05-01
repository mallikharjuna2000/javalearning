package com.codegnan.java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExamplee {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i>10;
		System.out.println(p.test(5));
        Predicate<String>p1=s->s.length()>5;
        System.out.println(p1.test("mallikharjuna"));
        Predicate<Integer> p2=i->i%2==0;
        System.out.println(p2.test(5));
        Predicate<Employee> highSalary=e->e.getSalary()>50000;
        Employee e1=new Employee("Ravi",50000);
        Employee e2=new Employee("arjun",75000);
        System.out.println(e1.getName()+" earns high salary "+highSalary.test(e1));
        System.out.println(e2.getName()+" earns high salary "+highSalary.test(e2));
        BiPredicate<Integer,Integer>isSumEven=(a,b)->(a+b)%2==0;
        System.out.println(isSumEven.test(10,20));
        }

}
