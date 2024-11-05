package clonning;

class Address{
	String city;
	String state;
	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}
	
	public Address(Address address) {
		this.city = address.city;
		this.state = address.state;
	}
}

class Person{
	String name;
	int age;
	Address address;
	public Person(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	//Copy Constructor
	public Person(Person person) {
		this.name = person.name;
		this.age = person.age;
		this.address = new Address(person.address); //Using Address's copy constructor
		
	}
}
public class CopyConstructor {
	public static void main(String []args) {
		Address address1 = new Address("New York","NY");
		Person person1 = new Person("John",30,address1);
		
		//Creating a copy of person1 using th copy constructor
		Person person2 = new Person(person1);
		
		// Display original and copied object details
        System.out.println("Original Person: " + person1.name + ", " + person1.age + ", " + person1.address.city);
        System.out.println("Copied Person: " + person2.name + ", " + person2.age + ", " + person2.address.city);
        
        person2.address.city = "Los Angeles";
        
        System.out.println("Original Person's City: " + person1.address.city); // Should be "New York"
        System.out.println("Copied Person's City: " + person2.address.city);   // Should be "Los Angeles"
	}
}
