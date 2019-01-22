package psn.redpig.springcore;

/**
 * ExampleBean7
 * @author redpig
 * 用于测试初始化和销毁回调
 */
public class ExampleBean7 {
	public ExampleBean7() {
		System.out.println("ExampleBean7 constructed!");
	}
	
	public void init() {
		System.out.println("ExampleBean7 init callback!");
	}
	
	public void destroy() {
		System.out.println("ExampleBean7 destroy callback!");
	}
}
