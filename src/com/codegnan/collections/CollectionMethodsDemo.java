package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethodsDemo {

	public static void main(String[] args) {
		// Creating a Collection using ArrayList
				Collection<String> fruits = new ArrayList<String>();
				System.out.println("------ add() ------");
				// add(Object o): Adds a single element to the collection.
				fruits.add("Apple");
				fruits.add("Banana");
				fruits.add("Cherry");
				fruits.add("Kiwi");
				fruits.add("Pineapple");
				System.out.println("Fruits after add(): " + fruits);
				System.out.println("\n------ addAll() ------");
				// addAll(Collection c): Adds all elements of another collection.
				Collection<String> moreFruits = new ArrayList<String>();
				moreFruits.add("Mango");
				moreFruits.add("Grapes");
				moreFruits.add("Orange");
				moreFruits.add("Papaya");
				fruits.addAll(moreFruits);
				System.out.println("Fruits after addAll(): " + fruits);
				System.out.println("\n------ remove() ------");
				// remove(Object o): Removes a specific element.
				fruits.remove("Banana");
				System.out.println("Fruits after remove('Banana'): " + fruits);
				System.out.println("\n------ removeAll() ------");
				// removeAll(Collection c): Removes all elements that are also in another
				// collection.
				Collection<String> removeList = new ArrayList<String>();
				removeList.add("Mango");
				removeList.add("Cherry");
				removeList.add("Papaya");
				fruits.removeAll(removeList);
				System.out.println("Fruits after removeAll(Mango, Cherry, Papaya): " + fruits);
				System.out.println("\n------ retainAll() ------");
				// retainAll(Collection c): Keeps only elements that are also in c (removes all
				// others).
				Collection<String> retainList = new ArrayList<String>();
				retainList.add("Apple");
				retainList.add("Grapes");
				retainList.add("Orange");
				fruits.retainAll(retainList);
				System.out.println("Fruits after retainAll(Apple, Grapes, Orange): " + fruits);
				System.out.println("\n------ contains() ------");
				// contains(Object o): Checks if the collection contains the given element.
				System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
				System.out.println("Contains 'Pineapple'? " + fruits.contains("Pineapple"));
				System.out.println("\n------ containsAll() ------");
				// containsAll(Collection c): Checks if collection contains all elements of
				// another collection.
				Collection<String> checkList = new ArrayList<String>();
				checkList.add("Apple");
				checkList.add("Grapes");
				System.out.println("Contains all (Apple, Grapes)? " + fruits.containsAll(checkList));
				System.out.println("\n------ size() ------");
				// size(): Returns number of elements.
				System.out.println("Number of fruits: " + fruits.size());
				System.out.println("\n------ isEmpty() ------");
				// isEmpty(): Checks if the collection is empty.
				System.out.println("Is collection empty? " + fruits.isEmpty());
				System.out.println("\n------ toArray() ------");
				// toArray(): Converts collection to array.
				Object[] fruitArray = fruits.toArray();
				System.out.print("Fruits as Array: ");
				for (int i = 0; i < fruitArray.length; i++) {
					System.out.print(fruitArray[i] + " ");
				}
				System.out.println();
				System.out.println("\n------ iterator() ------");
				// iterator(): Returns an iterator to loop through elements.
				System.out.print("Iterating using Iterator: ");
				Iterator<String> itr = fruits.iterator();
				while (itr.hasNext()) {
					System.out.print(itr.next() + " ");
				}
				System.out.println("\n\n------ clear() ------");
				// clear(): Removes all elements from collection.
				fruits.clear();
				System.out.println("Fruits after clear(): " + fruits);
				System.out.println("Is collection empty after clear()? " + fruits.isEmpty());

	}

}
