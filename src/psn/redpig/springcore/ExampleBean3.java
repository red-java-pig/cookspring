package psn.redpig.springcore;

public class ExampleBean3 {
	private AnotherBean beanOne;
	private YetAnotherBean beanTwo;
	private int i;
	
	private ExampleBean3(AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
		this.beanOne = anotherBean;
		this.beanTwo = yetAnotherBean;
		this.i = i;
		System.out.println("ExampleBean3 constructed!");
	}
	
	public static ExampleBean3 createInstance(AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
		return new ExampleBean3(anotherBean, yetAnotherBean, i);
	}
}
