package psn.redpig.springcore;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * ExampleBean8
 * @author john
 * ͨ��ʵ��spring��InitializingBean��DisposableBean�ӿڽ��г�ʼ�������ٻص�
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
