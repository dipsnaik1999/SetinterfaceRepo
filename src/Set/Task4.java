package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Task 4: Performance Analysis

public class Task4 {
	public static void main(String[] args) {
        int n = 1000000; // Number of elements to test with

        // HashSet performance measurement
        Set<Person> hashSet = new HashSet<>();
        measurePerformance(hashSet, "HashSet", n);

        // LinkedHashSet performance measurement
        Set<Person> linkedHashSet = new LinkedHashSet<>();
        measurePerformance(linkedHashSet, "LinkedHashSet", n);
    }

    private static void measurePerformance(Set<Person> set, String setType, int n) {
        // Measure add operation
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            set.add(new Person(i, "Person" + i, i % 100));
        }
        long end = System.nanoTime();
        long addTime = (end - start) / 1000000; // Convert to milliseconds

        // Measure contains operation
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            set.contains(new Person(i, "Person" + i, i % 100));
        }
        end = System.nanoTime();
        long containsTime = (end - start) / 1000000; // Convert to milliseconds

        // Measure remove operation
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            set.remove(new Person(i, "Person" + i, i % 100));
        }
        end = System.nanoTime();
        long removeTime = (end - start) / 1000000; // Convert to milliseconds

        // Print results
        System.out.println("\nPerformance analysis for " + setType + " with " + n + " elements:");
        System.out.println("Add operation: " + addTime + "ms");
        System.out.println("Contains operation: " + containsTime + "ms");
        System.out.println("Remove operation: " + removeTime + "ms");
    }
}


