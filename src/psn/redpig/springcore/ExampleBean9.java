package psn.redpig.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * ExampleBean9
 * @author john
 * һ��bean��ͬ�������ڻص��Ľ��
 */
public class ExampleBean9 implements DisposableBean, InitializingBean {
	public ExampleBean9() {
		System.out.println("ExampleBean9 constructed!");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ExampleBean9 destroy callback!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ExampleBean9 afterPropertiesSet callback!");
	}

	public void init() {
		System.out.println("ExampleBean9 custom init callback!");
	}

	public void close() {
		System.out.println("ExampleBean9 custom destroy callback!");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("ExampleBean9 postConstruct callback!");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("ExampleBean9 preDestroy callback!");
	}
}
