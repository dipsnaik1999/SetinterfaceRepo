package Set;

	import java.util.*;

	////Task 1: Custom Object Manipulation
	
	class Person {
	    private int id;
	    private String name;
	    int age;

	    public Person(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    public int getId() {
	        return id;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == this) return true;
	        if (!(obj instanceof Person)) return false;
	        Person other = (Person) obj;
	        return this.id == other.id;
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

	    @Override
	    public String toString() {
	        return "Person{id=" + id + ", name='" + name + "', age=" + age + "}";
	    }

		public int getAge() {
			// TODO Auto-generated method stub
			return 0;
		}
	

	    public static void main(String[] args) {
	        HashSet<Person> hashSet = new HashSet<>();
	        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();

	        // Adding elements to HashSet and LinkedHashSet
	        Person person1 = new Person(1, "Dipali", 30);
	        Person person2 = new Person(2, "Nikita", 25);
	        Person person3 = new Person(3, "Sanjana", 35);
	        Person person4 = new Person(1, "Rutuja", 40); // Duplicate id
	        Person person5 = new Person(5, "Ankita", 28);

	        hashSet.add(person1);
	        hashSet.add(person2);
	        hashSet.add(person3);
	        hashSet.add(person4); // This won't be added due to duplicate id
	        hashSet.add(person5);

	        linkedHashSet.add(person1);
	        linkedHashSet.add(person2);
	        linkedHashSet.add(person3);
	        linkedHashSet.add(person4); // This won't be added due to duplicate id
	        linkedHashSet.add(person5);

	        // Print HashSet and LinkedHashSet
	        System.out.println("HashSet:");
	        System.out.println(hashSet);

	        System.out.println("\nLinkedHashSet:");
	        System.out.println(linkedHashSet);
	    }
	    public static void addPerson(Set<Person> set, Person person) {
	        set.add(person);
	    }
	}


