package psn.redpig.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * ExampleBean8
 * @author john
 * 通过实现spring的InitializingBean和DisposableBean接口进行初始化和销毁回调
 */
public class ExampleBean8 implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ExampleBean8 destroy callback!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ExampleBean8 init callback!");
	}
	

}
