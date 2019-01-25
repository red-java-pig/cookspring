package psn.redpig.springcore;

public class DerivedTestBean {
	private String name;
	private int age;

	public DerivedTestBean(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("DerivedTestBean Constructed!");
	}

	public String toString() {
		return "DerivedTestBean:My name is " + name + ", and I'm " + age + " years old!";
	}
}
