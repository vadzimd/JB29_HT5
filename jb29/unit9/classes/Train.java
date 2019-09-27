package jb29.unit9.classes;

import java.util.Date;

public class Train {

	private String namePoint;
	private int trainNumber;
	private Date departureDate;

	public Train() {

	}

	public Train(String namePoint, int trainNumber, Date departureDate) {
		super();
		this.namePoint = namePoint;
		this.trainNumber = trainNumber;
		this.departureDate = departureDate;
	}

	public String getNamePoint() {
		return namePoint;
	}

	public void setNamePoint(String namePoint) {
		this.namePoint = namePoint;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	@Override
	public String toString() {
		return "Train [namePoint=" + namePoint + ", trainNumber=" + trainNumber + ", departureDate=" + departureDate
				+ "]";
	}

}
