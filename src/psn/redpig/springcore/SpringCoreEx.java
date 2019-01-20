package psn.redpig.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreEx {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml", "dataSource.xml");

		// null�Ϳմ�
		ExampleBean4 eb41 = (ExampleBean4) ac.getBean("exampleBean41");
		System.out.println("exampleBean41 == �մ��� " + (eb41.getEmail() == ""));
		System.out.println("exampleBean41 equals �մ��� " + eb41.getEmail().equals(""));
		ExampleBean4 eb42 = (ExampleBean4) ac.getBean("exampleBean42");
		System.out.println("exampleBean42 == null�� " + (eb42.getEmail() == null));
		// System.out.println("exampleBean42 equals null�� " +
		// eb42.getEmail().equals(null));��ָ���쳣������ʱ����
		ExampleBean5 eb51 = (ExampleBean5) ac.getBean("exampleBean51");
		System.out.println("exampleBean51 == �մ��� " + (eb51.getEmail() == ""));
		System.out.println("exampleBean51 equals �մ��� " + eb51.getEmail().equals(""));
		ExampleBean5 eb52 = (ExampleBean5) ac.getBean("exampleBean52");
		System.out.println("exampleBean52 == null�� " + (eb52.getEmail() == null));
		// System.out.println("exampleBean52 equals null�� " +
		// eb52.getEmail().equals(null));��ָ���쳣������ʱ����

		// p-namespace��ʹ��setter������������ע��
		ExampleBean4 eb43 = (ExampleBean4) ac.getBean("exampleBean43");
		System.out.println("exampleBean43 email�� " + eb43.getEmail());
		Person johndon = (Person) ac.getBean("john-modern");
		System.out.println("p-namespace:" + johndon);
		
		// c-namespace��ʹ��constructor-arg������������ע��
		ThingOne th1 = (ThingOne) ac.getBean("thingOne");
		System.out.println("c-namespace:" + th1.getEmail());
	}
}