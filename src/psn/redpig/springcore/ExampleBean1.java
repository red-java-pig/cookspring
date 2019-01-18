package psn.redpig.springcore;

public class ExampleBean1 {
	private AnotherBean beanOne;
	private YetAnotherBean beanTwo;
	private int i;

	public void setBeanOne(AnotherBean beanOne) {
		this.beanOne = beanOne;
	}

	public void setBeanTwo(YetAnotherBean beanTwo) {
		this.beanTwo = beanTwo;
	}

	public void setIntegerProperty(int i) {
		this.i = i;
	}

	public int getIntegerProperty() {
		return i;
	}

	public AnotherBean getBeanOne() {
		return beanOne;
	}

	public YetAnotherBean getBeanTwo() {
		return beanTwo;
	}
}
