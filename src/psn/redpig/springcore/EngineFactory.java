package psn.redpig.springcore;

public class EngineFactory {
	private static Engine engine = new Engine();
	
	public Engine produceEngine() {
		return engine;
	}
}