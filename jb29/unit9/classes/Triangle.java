package jb29.unit9.classes;

public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public double perimiter() {

		return a.calcDistance(b) + b.calcDistance(c) + c.calcDistance(a);
	}

	public double square() {

		double halfPerimeter = perimiter() / 2;

		return Math.sqrt(halfPerimeter * (halfPerimeter - a.calcDistance(b)) * (halfPerimeter - b.calcDistance(c))
				* (halfPerimeter - c.calcDistance(a)));
	}

	public Point getIntersectionMedianPoint() {

		Point point = new Point((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);

		return point;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
