package jb29.unit9.classes;

public class Task06 {

	public Task06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Time time = new Time(12, 15, 12);

		Time timeAdd = new Time(2, 12, 13);

		time.addTime(timeAdd);

		System.out.println(time.toString());

	}

}
