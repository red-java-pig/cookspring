package psn.redpig.springcore;

public class Avatar {
	private Person person;

	public Avatar(Person person) {
		this.person = person;
		System.out.println(person);
		System.out.println("Avatar constructed!");
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
