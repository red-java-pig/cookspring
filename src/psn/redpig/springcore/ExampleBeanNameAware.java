package psn.redpig.springcore;

import org.springframework.beans.factory.BeanNameAware;

public class ExampleBeanNameAware implements BeanNameAware {

	private String myName;

	public ExampleBeanNameAware() {
		System.out.println("ExampleBeanNameAware constructed!");
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		myName = arg0;
	}

	public void whoAmI() {
		System.out.println("I am " + myName);
	}

}
