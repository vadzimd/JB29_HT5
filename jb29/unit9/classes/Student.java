package jb29.unit9.classes;

public class Student {

	String surname;
	String name;
	String patrioticName;
	int groupNumber;
	int score;

	public Student() {
	}

	public Student(String surname, String name, String patrioticName, int groupNumber, int score) {
		super();
		this.surname = surname;
		this.name = name;
		this.patrioticName = patrioticName;
		this.groupNumber = groupNumber;
		this.score = score;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatrioticName() {
		return patrioticName;
	}

	public void setPatrioticName(String patrioticName) {
		this.patrioticName = patrioticName;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [surname=" + surname + ", groupNumber=" + groupNumber + "]";
	}

}
