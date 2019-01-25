package psn.redpig.springcore;

public class DerivedTestBean extends TestBean {
	//private String name;
	//private int age;
	private String gender;

	public DerivedTestBean(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
		System.out.println("DerivedTestBean Constructed!");
	}

	public String toString() {
		return super.toString() + " I am a " + gender + "!";
	}
}
