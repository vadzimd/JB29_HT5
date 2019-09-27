package jb29.unit9.classes;

public class Counter {

	private int count;
	private int max;
	private int min;

	public Counter() {
		this.count = 0;
		this.min = 0;
		this.max = 100;
	}

	public Counter(int count, int min, int max) {
		this.count = count;
		this.min = min;
		this.max = max;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void increaseCounter() {
		if (++count > max) {
			System.out.println("You exceeded max limit");
			System.exit(0);
		}
	}

	public void decreaseCounter() throws Exception {
		if (--count < min) {
			System.out.println("You exceeded min limit");
			System.exit(0);

		}
	}

	@Override
	public String toString() {
		return "Counter [count=" + count + ", max=" + max + ", min=" + min + "]";
	}
	
	
}
