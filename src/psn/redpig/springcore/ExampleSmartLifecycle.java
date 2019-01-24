package psn.redpig.springcore;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * ExampleSmartLifecycle
 * 
 * @author redpig Spring��SmartLifecycle������
 */
@Component
public class ExampleSmartLifecycle implements SmartLifecycle {

	private boolean isRunning = false;

	/**
	 * �̳���Lifecycle��Ĭ�Ϸ���ֵtrue��
	 * �������������ApplicationContextˢ��ʱ��Ӧ���������Զ�����Lifecycle������򷵻�true
	 * ���򷵻�false����ʾ��Ҫ��ʾ����start()����������
	 */
	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		return isRunning;
	}

	@Override
	public void start() {
		System.out.println("ExampleSmartLifecycle started!");
		// TODO Auto-generated method stub
		this.isRunning = true;
	}

	/**
	 * ָʾ����������������ǰ��������, �����ֹͣ������� ���ṩ�Ļص���LifecycleProcessor����,
	 * ��֧�־��й����ػ�˳��ֵ�����������������Ϳ��ܲ����Ĺػ��� �ص�������SmartLifecycle���ȷʵֹͣ��ִ�С�
	 * LifecycleProcessor��ֻ���� stop������������壻 ���������ڴ˷�����ʵ���У�����ʽ��ί�ɣ� ����
	 * SmartLifecycle��ʵ�ֲ������Lifecycle.stop()��
	 * Ĭ��ʵ��ί�и�Lifecycle.stop()���������ڵ����߳��д��������Ļص���
	 * ��ע�⣺����֮��û��ͬ��������Զ���ʵ�ֿ�������ϣ�����䳣�����������ڼ����� (�����) �з�����ͬ�Ĳ��衣
	 */
	@Override
	public void stop(Runnable callback) {
		System.out.println("ExampleSmartLifecycle stoped!");
		// TODO Auto-generated method stub
		callback.run();
		this.isRunning = false;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public int getPhase() {
		return 0;
	}

}
