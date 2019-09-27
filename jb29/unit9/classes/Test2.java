package jb29.unit9.classes;

// 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

public class Test2 {
	private int n;
	private int m;

	public Test2() {
		n = 0;
		m = 0;
	}

	public Test2(int n, int m) {
		if (n == m) {
			n += 1;
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

}
