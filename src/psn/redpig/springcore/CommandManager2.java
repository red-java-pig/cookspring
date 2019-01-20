package psn.redpig.springcore;

public abstract class CommandManager2 {
	public CommandManager2() {
		System.out.println("CommandManager2 constructed!");
	}
	
	public void process() {
		createMyCommand();
	}
	
	protected abstract MyCommand createMyCommand();
}
