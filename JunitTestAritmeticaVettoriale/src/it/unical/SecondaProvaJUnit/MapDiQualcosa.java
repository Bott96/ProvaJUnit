package it.unical.SecondaProvaJUnit;

import java.util.HashMap;

public class MapDiQualcosa {

	HashMap<Integer, String> m = new HashMap<>();

	public void addElem(int i, String n) {
		m.put(i, n);
	}

	public void remove(int i) {

		if (m.size() == 0) {
			throw new RuntimeException("Mappa Vuota");
		}

		m.remove(i);

	}

	public static void main(String[] args) {

		MapDiQualcosa m = new MapDiQualcosa();

		m.addElem(1, "sasa");
		m.addElem(3, "sasa");
		m.addElem(2, "sasa");

	}

}
