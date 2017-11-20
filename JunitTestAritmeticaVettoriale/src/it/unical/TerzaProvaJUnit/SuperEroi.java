package it.unical.TerzaProvaJUnit;

import java.util.ArrayList;

public class SuperEroi {

	ArrayList<String> lstSuper;

	public SuperEroi() {
		lstSuper = new ArrayList<>();

	}

	public void addSuperEroe(String s) {
		lstSuper.add(s);
	}

	public String getSuperEroe(int i) throws IllegalArgumentException {
		if (i >= lstSuper.size())
			throw new IllegalArgumentException("Dim out");

		return lstSuper.get(i);
	}

	public boolean getEroe(String s) {
		return lstSuper.contains(s);
	}

	public int getSize() {
		return lstSuper.size();
	}

	public void removeSuper(String s) throws IllegalArgumentException {

		if (!lstSuper.contains(s))
			throw new IllegalArgumentException("no obj inside");

		lstSuper.remove(s);

	}
}
