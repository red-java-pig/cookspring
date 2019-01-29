package psn.redpig.springcore;

public class DerivedTestBeanWithoutClass {
	private String name;
	private int age;
	private String gender;

	public DerivedTestBeanWithoutClass(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("DerivedTestBeanWithoutClass Constructed!");
	}

	public String toString() {
		return this.getClass().getSimpleName() + ":My name is " + name + ", and I'm " + age + " years old!" + " I am a "
				+ gender + "!";
	}
}
