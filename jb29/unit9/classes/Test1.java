package jb29.unit9.classes;

// 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

public class Test1 {
	private int n;
	private int m;

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

	public int getSum() {
		return m + n;
	}

	public int getGreater() {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}

	@Override
	public String toString() {
		return "Test1 [n=" + n + ", m=" + m + "]";
	}

}
