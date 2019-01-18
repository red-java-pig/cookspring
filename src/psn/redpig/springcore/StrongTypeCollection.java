package psn.redpig.springcore;

import java.util.Map;

public class StrongTypeCollection {
	private Map<String, Float> accounts;

	public StrongTypeCollection() {
		System.out.println("StrongTypeCollection constructed");
	}

	public Map<String, Float> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, Float> accounts) {
		this.accounts = accounts;
	}

}
