package psn.redpig.springcore;

public class Person {
	private String name;
	private int age;
	private Person spouse;

	public Person() {
		System.out.println("Person constructed!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Name: " + name + " Age: " + age + " Spourse is: " + spouse;
	}

	public Person getSpouse() {
		return spouse;
	}

	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}

}
