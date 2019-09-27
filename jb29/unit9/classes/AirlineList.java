package jb29.unit9.classes;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {

	private List<Airline> airlines;

	public AirlineList() {
		airlines = new ArrayList<Airline>();
	}

	public void add(Airline airline) {

		airlines.add(airline);
	}

	public void remove(Airline airline) {

		airlines.remove(airline);
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	@Override
	public String toString() {
		return "AirlineList [airlines=" + airlines + "]";
	}

}
