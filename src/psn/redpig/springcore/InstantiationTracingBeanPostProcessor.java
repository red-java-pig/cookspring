package psn.redpig.springcore;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * InstantiationTracingBeanPostProcessor
 * 
 * @author redpig 调用容器中每个bean的toString方法
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {
	//
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("InstantiationTracingBeanPostProcessor postProcessBeforeInitialization: do nothing!");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("Bean '" + beanName + "' created : " + bean.toString());
		return bean;
	}

}
