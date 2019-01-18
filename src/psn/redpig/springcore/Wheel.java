package psn.redpig.springcore;

public class Wheel {
	private int wheelNum;

	public Wheel(int wheelNum) {
		System.out.println("wheel number " + wheelNum + " is ready!");
		this.wheelNum = wheelNum;
	}

	public int getWheelNum() {
		return wheelNum;
	}

	public void setWheelNum(int wheelNum) {
		this.wheelNum = wheelNum;
	}

}
