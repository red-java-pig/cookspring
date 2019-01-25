package psn.redpig.springcore;

public abstract class TestBean {
	private String name;
	private int age;

	public TestBean(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("TestBean Constructed!");
	}

	public String toString() {
		return this.getClass().getSimpleName() + ":My name is " + name + ", and I'm " + age + " years old!";
	}
}
