package psn.redpig.springcore;

public class MyCommand {
	private static int index = 0;
	public MyCommand() {
		index++;
		System.out.println("MyCommand " + index + " constructed!");
	}
}
