package com.codegnan.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodsExample {

	public static void main(String[] args) {
		  // Create a HashMap to store student names (String) and marks (Integer)
        Map<String, Integer> studentMarks = new HashMap<>();


        // put(key, value) - add entries to the map
        studentMarks.put("Arjun", 88);
        studentMarks.put("Ravi", 92);
        studentMarks.put("Sita", 79);
        studentMarks.put("Priya", 85);
        studentMarks.put("Rahul", 91);


        // putAll(Map m) - add multiple entries from another map
        Map<String, Integer> newStudents = new HashMap<>();
        newStudents.put("Ananya", 95);
        newStudents.put("Vikram", 82);
        newStudents.put("Meera", 87);
        studentMarks.putAll(newStudents);


        // get(key) - returns the value associated with the key
        System.out.println("Marks of Arjun: " + studentMarks.get("Arjun"));


        // remove(key) - removes entry and returns value
        System.out.println("Removed Priya's marks: " + studentMarks.remove("Priya"));


        // containsKey(key) - checks if a key exists
        System.out.println("Is Sita present? " + studentMarks.containsKey("Sita"));


        // containsValue(value) - checks if a value exists
        System.out.println("Any student scored 100? " + studentMarks.containsValue(100));


        // isEmpty() - checks if the map has no entries
        System.out.println("Is map empty? " + studentMarks.isEmpty());


        // size() - returns number of key-value pairs
        System.out.println("Total students: " + studentMarks.size());


        // keySet() - returns all keys as a Set
        Set<String> studentNames = studentMarks.keySet();
        System.out.println("Student names: " + studentNames);
        // values() - returns all values as a Collection
        Collection<Integer> marks = studentMarks.values();
        System.out.println("Marks: " + marks);
        // entrySet() - returns all entries as a Set of Map.Entry
        Set<Map.Entry<String, Integer>> entries = studentMarks.entrySet();
        System.out.println("All entries:");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // clear() - removes all entries from the map
        studentMarks.clear();
        System.out.println("Map cleared. Is empty? " + studentMarks.isEmpty());
	}
}
