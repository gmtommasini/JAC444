package Shapes;


public class Triangle implements Shape {
	private double s1;
	private double s2;
	private double s3;

	public Triangle(double side1, double side2, double side3) {
		this.s1 = side1;
		this.s2 = side2;
		this.s3 = side3;
	}

	public double getSide1() {
		return s1;
	}
	public void setSide1(double side1) {
		this.s1 = side1;
	}

	public double getSide2() {
		return s2;
	}
	public void setSide2(double side2) {
		this.s2 = side2;
	}

	public double getSide3() {
		return s3;
	}
	public void setSide3(double side3) {
		this.s3 = side3;
	}

	@Override
	public double perimeter() {
		return s1+s2+s3;
	}

	@Override
	public String toString() {
		return "Triangle {s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "} perimeter = " + String.format("%g",perimeter());
	}

}
