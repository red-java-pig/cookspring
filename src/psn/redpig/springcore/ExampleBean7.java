package psn.redpig.springcore;

/**
 * ExampleBean7
 * @author redpig
 * ���ڲ��Գ�ʼ�������ٻص�
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
