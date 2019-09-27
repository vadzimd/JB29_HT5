package jb29.unit9.classes;

import java.util.Date;

public class Airline {

	private String destinationPoint;
	private String flightNumber;
	private String planeType;
	private Date departureTime;
	private String weekDay;

	public Airline() {
		// TODO Auto-generated constructor stub
	}

	public Airline(String destinationPoint, String flightNumber, String planeType, Date departureTime, String weekDay) {
		super();
		this.destinationPoint = destinationPoint;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.departureTime = departureTime;
		this.weekDay = weekDay;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	@Override
	public String toString() {
		return "Airline [destinationPoint=" + destinationPoint + ", flightNumber=" + flightNumber + ", planeType="
				+ planeType + ", departureTime=" + departureTime + ", weekDay=" + weekDay + "]\n";
	}

}
