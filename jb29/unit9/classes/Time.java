package jb29.unit9.classes;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {

		hour = 0;
		minute = 0;
		second = 0;
	}

	public Time(int hour, int minute, int second) {

		setHour(hour);
		setMinute(minute);
		setSecond(second);

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		if (hour < 0 || hour > 24) {
			this.hour = 0;

		} else {
			this.hour = hour;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {

		if (minute < 0 || minute > 59) {
			this.minute = 0;

		} else {
			this.minute = minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {

		if (second < 0 || second > 59) {
			this.second = 0;

		} else {
			this.second = second;
		}
	}

	public void addTime(Time timeAdd) {

		int timeSeconds;

		timeSeconds = (this.hour + timeAdd.getHour()) * 3600 + (this.minute + timeAdd.getMinute()) * 60
				+ (this.second + timeAdd.getSecond());

		this.hour = timeSeconds / 3600;
		this.minute = (timeSeconds - this.hour * 3600) / 60;
		this.second = timeSeconds - this.hour * 3600 - this.minute * 60;

		while (this.hour > 24) {
			this.hour -= 24;
		}

	}

	@Override
	public String toString() {
		return "Time [hours:" + hour + ", minutes:" + minute + ", seconds:" + second + "]";
	}

}
