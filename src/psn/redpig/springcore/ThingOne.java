package psn.redpig.springcore;

public class ThingOne {
	private ThingTwo thingTwo;
	private ThingThree thingThree;
	private String email;

	public ThingOne(ThingTwo thingTwo, ThingThree thingThree, String email) {
		this.thingTwo = thingTwo;
		this.thingThree = thingThree;
		this.email = email;
		System.out.println("ThingOne construced!");
	}

	public ThingTwo getThingTwo() {
		return thingTwo;
	}

	public void setThingTwo(ThingTwo thingTwo) {
		this.thingTwo = thingTwo;
	}

	public ThingThree getThingThree() {
		return thingThree;
	}

	public void setThingThree(ThingThree thingThree) {
		this.thingThree = thingThree;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
