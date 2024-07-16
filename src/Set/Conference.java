package Set;

import java.util.HashSet;
import java.util.Set;

////Task 5: Real-World Scenario

public class Conference {
	 private Set<Person> attendees;
	 

	 public Conference() {
	        this.attendees = new HashSet<>();
	 }

    public void addAttendee(Person person) {
        attendees.add(person);
    }

    public void removeAttendee(Person person) {
        attendees.remove(person);
    }



    public Set<Person> findDuplicateAttendees() {
        Set<Integer> id = new HashSet<>();
        Set<Person> duplicates = new HashSet<>();
        for (Person person : attendees) {
            if (!id.add(person.getId())) {
                duplicates.add(person);
            }
        }
        return duplicates;
    }

    public Set<Person> listUniqueAttendees() {
        return new HashSet<>(attendees); // Return a copy of the set to ensure uniqueness
    }

    public Set<Person> findAttendeesInAgeRange(int minAge, int maxAge) {
    	 Set<Person> result = new HashSet<>();
	        for (Person person : attendees) {
	            if (person.age >= minAge && person.age <= maxAge) {
	                result.add(person);
        return result;
	            }
	        }
			return null;
    }
	            @Override
	    	    public String toString() {
	    	        return "Conference{attendees=" + attendees + '}';
	    	    }
	         // Usage example
	    	    
	            public static void main(String[] args) {
             Conference conference = new Conference();
             conference.addAttendee(new Person(1, "Dipali", 30));
             conference.addAttendee(new Person(2, "Nikita", 25));
             conference.addAttendee(new Person(3, "Sanjana", 35));
             conference.addAttendee(new Person(1, "Dipali", 30)); 
             
             System.out.println("Conference Attendees: " + conference);
             
             Set<Person> duplicates = conference.findDuplicateAttendees();
 	        System.out.println("Duplicate Attendees: " + duplicates);

 	        Set<Person> uniqueAttendees = conference.listUniqueAttendees();
 	        System.out.println("Unique Attendees: " + uniqueAttendees);

 	        Set<Person> ageRangeAttendees = conference.findAttendeesInAgeRange(25, 30);
 	        System.out.println("Attendees with age between 25 and 30: " + ageRangeAttendees);
             }
	            }
