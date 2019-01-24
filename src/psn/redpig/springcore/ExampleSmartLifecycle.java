package psn.redpig.springcore;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * ExampleSmartLifecycle
 * 
 * @author redpig Spring中SmartLifecycle的作用
 */
@Component
public class ExampleSmartLifecycle implements SmartLifecycle {

	private boolean isRunning = false;

	/**
	 * 继承自Lifecycle，默认返回值true。
	 * 如果在所包含的ApplicationContext刷新时，应该由容器自动启动Lifecycle组件，则返回true
	 * 否则返回false，表示需要显示调用start()方法启动。
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
	 * 指示如果生命周期组件当前正在运行, 则必须停止该组件。 所提供的回调由LifecycleProcessor调用,
	 * 以支持具有公共关机顺序值的所有组件进行有序和可能并发的关机。 回调必须在SmartLifecycle组件确实停止后执行。
	 * LifecycleProcessor将只调用 stop方法的这个变体； 即，除非在此方法的实现中，被显式地委派， 否则，
	 * SmartLifecycle的实现不会调用Lifecycle.stop()。
	 * 默认实现委托给Lifecycle.stop()，并立即在调用线程中触发给定的回调。
	 * 请注意：两者之间没有同步，因此自定义实现可能至少希望在其常见的生命周期监视器 (如果有) 中放置相同的步骤。
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
