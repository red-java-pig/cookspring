package psn.redpig.springcore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;

public class DifComplexObject {
	private Hashtable<Object, Object> adminEmails;
	private ArrayList<Object> someList;
	private HashMap<Object, Object> someMap;
	private HashSet<Object> someSet;

	public Hashtable<Object, Object> getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Hashtable<Object, Object> adminEmails) {
		this.adminEmails = adminEmails;
	}

	public ArrayList<Object> getSomeList() {
		return someList;
	}

	public void setSomeList(ArrayList<Object> someList) {
		this.someList = someList;
	}

	public HashMap<Object, Object> getSomeMap() {
		return someMap;
	}

	public void setSomeMap(HashMap<Object, Object> someMap) {
		this.someMap = someMap;
	}

	public HashSet<Object> getSomeSet() {
		return someSet;
	}

	public void setSomeSet(HashSet<Object> someSet) {
		this.someSet = someSet;
	}
}
