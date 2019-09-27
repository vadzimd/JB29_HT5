package jb29.unit9.classes;

import java.util.ArrayList;
import java.util.List;

// 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Task03 {

	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<Student>();

		for (int i = 1; i <= 10; i++) {

			studentList.add(new Student("surname" + i, "name" + i, "patrioticName" + i, i + 10, i));

		}

		for (Student student : studentList) {
			if (student.getScore() == 9 || student.getScore() == 10)
				System.out.println(student.toString());
		}
	}

}
