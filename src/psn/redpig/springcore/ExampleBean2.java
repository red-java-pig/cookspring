package psn.redpig.springcore;

public class ExampleBean2 {
	private AnotherBean beanOne;
	private YetAnotherBean beanTwo;
	private int i;

	public ExampleBean2(AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
		this.beanOne = anotherBean;
		this.beanTwo = yetAnotherBean;
		this.i = i;
		System.out.println("ExampleBean2 constructed!");
	}

	public AnotherBean getBeanOne() {
		return beanOne;
	}

	public void setBeanOne(AnotherBean beanOne) {
		this.beanOne = beanOne;
	}

	public YetAnotherBean getBeanTwo() {
		return beanTwo;
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
}
