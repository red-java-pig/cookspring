package psn.redpig.springcore;

public class Car {
	private Engine engine;
	private Wheel wheel;

	public Car(Engine engine, Wheel wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void move() {
		System.out.println("Car is moving!");
	}

}
