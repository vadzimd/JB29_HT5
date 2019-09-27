package jb29.unit9.classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Task10 {

	public static void main(String[] args) {

		AirlineList airlineList = new AirlineList();

		Calendar cal = Calendar.getInstance();

		cal.add(Calendar.HOUR, -5);
		airlineList.add(new Airline("Heraklion", "BRU8118", "Embraer 195", cal.getTime(), "Friday"));
		cal.add(Calendar.HOUR, -5);
		airlineList.add(new Airline("Barcelona", "B2869", "Boeing 737", cal.getTime(), "Thursday"));
		cal.add(Calendar.HOUR, -5);
		airlineList.add(new Airline("Istanbul", "TK8796", "Airbus 360", cal.getTime(), "Saturday"));

		System.out.println(airlineList);

		System.out.println(findAirlineByDestinationPoint(airlineList, "Barcelona"));
		System.out.println(findAirlineByWeekDay(airlineList, "Friday"));
		System.out.println(findAirlineByWeekDayTime(airlineList, "Saturday", cal.getTime()));
	}

	public static List<Airline> findAirlineByDestinationPoint(AirlineList custList, String destinationPoint) {

		List<Airline> airlineList;
		List<Airline> airlineListResult = new ArrayList<Airline>();

		Airline airline;

		airlineList = custList.getAirlines();

		for (int i = 0; i < airlineList.size(); i++) {
			airline = airlineList.get(i);

			if (airline.getDestinationPoint() == destinationPoint) {

				airlineListResult.add(airline);
			}
		}

		return airlineListResult;

	}

	public static List<Airline> findAirlineByWeekDay(AirlineList custList, String weekDay) {

		List<Airline> airlineList;
		List<Airline> airlineListResult = new ArrayList<Airline>();

		Airline airline;

		airlineList = custList.getAirlines();

		for (int i = 0; i < airlineList.size(); i++) {
			airline = airlineList.get(i);

			if (airline.getWeekDay() == weekDay) {

				airlineListResult.add(airline);
			}
		}

		return airlineListResult;

	}

	public static List<Airline> findAirlineByWeekDayTime(AirlineList custList, String weekDay, Date time) {

		List<Airline> airlineList;
		List<Airline> airlineListResult = new ArrayList<Airline>();

		Airline airline;

		airlineList = custList.getAirlines();

		for (int i = 0; i < airlineList.size(); i++) {
			airline = airlineList.get(i);

			if (airline.getWeekDay() == weekDay && airline.getDepartureTime().compareTo(time) >= 0) {

				airlineListResult.add(airline);
			}
		}

		return airlineListResult;

	}

}
