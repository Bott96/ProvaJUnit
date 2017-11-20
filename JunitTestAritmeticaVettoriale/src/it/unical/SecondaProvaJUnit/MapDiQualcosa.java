package it.unical.SecondaProvaJUnit;

import java.util.HashMap;

public class MapDiQualcosa {

	HashMap<Integer, String> m = new HashMap<>();

	public void addElem(int i, String n) {
		m.put(i, n);
	}

	public int getSize() {
		return m.size();
	}

	public void remove(int i) throws RuntimeException {

		if (m.size() == 0) {
			System.out.println("Wntro");
			throw new RuntimeException("Mappa Vuota");
		}

		m.remove(i);

	}

	public static void main(String[] args) {

		MapDiQualcosa m = new MapDiQualcosa();

		m.addElem(1, "sasa");
		m.addElem(3, "sasa");
		m.addElem(2, "sasa");

		m.remove(1);
		m.remove(2);
		m.remove(4);
		m.remove(4);

	}

}
