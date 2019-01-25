package psn.redpig.springcore;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExampleApplicationContextAware implements ApplicationContextAware {

	private ApplicationContext ac;
	
	public ExampleApplicationContextAware() {
		System.out.println("ExampleApplicationContextAware constructed!");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.ac = arg0;
	}
	
	public void process() {
		Car theCar = (Car)ac.getBean("car");
		System.out.println("********through ApplicationContextAware get the car begin to move it:");
		theCar.move();
		System.out.println("********through ApplicationContextAware get the car stop moving!");
	}
}
