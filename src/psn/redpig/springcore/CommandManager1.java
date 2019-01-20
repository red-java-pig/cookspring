package psn.redpig.springcore;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CommandManager1 implements ApplicationContextAware {
	private ApplicationContext ac;
	
	public CommandManager1() {
		System.out.println("CommandManager1 constructed!");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.ac = arg0;
	}
	
	public void process() {
		createMyCommand1();
	}

	protected MyCommand createMyCommand1() {
		return (MyCommand) this.ac.getBean("myCommand");
	}

}
