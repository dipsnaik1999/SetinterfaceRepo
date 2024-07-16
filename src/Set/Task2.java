package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Task 2: Set Operations
public class Task2 {
	

	public static void main(String[] args) 
	{
	
	 Set<Person> hashSet = new HashSet<>();
     Set<Person> linkedHashSet = new LinkedHashSet<>();

     hashSet.add(new Person(1, "Dipali", 30));
     hashSet.add(new Person(2, "Nikita", 25));
     hashSet.add(new Person(3, "Sanjana", 35));
     linkedHashSet.add(new Person(1, "Rupali", 30));
     linkedHashSet.add(new Person(4, "Rutuja", 40));
     linkedHashSet.add(new Person(5, "Ankita", 28));
     
     System.out.println("HashSet: " + hashSet);
     System.out.println("LinkedHashSet: " + linkedHashSet);
	// Assume we have hashSet and linkedHashSet from Task 1

	// Union
     Set<Person> union = new HashSet<>(hashSet);
     union.addAll(linkedHashSet);
     System.out.println("Union: " + union);
     
	// Intersection
     Set<Person> intersection = new HashSet<>(hashSet);
     intersection.retainAll(linkedHashSet);
     System.out.println("Intersection: " + intersection);
     
	// Difference (hashSet - linkedHashSet)
	Set<Person> difference1 = new HashSet<>(hashSet);
	difference1.removeAll(linkedHashSet);
	System.out.println("\nDifference (HashSet - LinkedHashSet):");
	System.out.println(difference1);

	// Difference (linkedHashSet - hashSet)
	Set<Person> difference2 = new HashSet<>(linkedHashSet);
	difference2.removeAll(hashSet);
	System.out.println("\nDifference (LinkedHashSet - HashSet):");
	System.out.println(difference2);
	}
}
