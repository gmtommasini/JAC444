package Shapes;

import Shapes.exceptions.ShapeException;

public class Triangle implements Shape {
	private double s1;
	private double s2;
	private double s3;

	public Triangle(double side1, double side2, double side3) throws ShapeException {
		if (side1 > 0 && side2 > 0 && side3 > 0) { //redundant, but necessary
			this.s1 = side1;
			this.s2 = side2;
			this.s3 = side3;
		} else {
			throw new ShapeException();
		}
	}

	//getters
	public double getSide1() {		return s1;	}
	public double getSide2() {		return s2;	}
	public double getSide3() {		return s3;	}

	//setters
	public void setSide1(double side1) throws ShapeException {
		if (side1 > 0) {		this.s1 = side1;}
		else { throw new ShapeException("Parameter value invalid! Lesser or equals to zero.");}
	}
	public void setSide2(double side2) throws ShapeException {
		if (side2 > 0) {	this.s2 = side2;}
		else { throw new ShapeException("Parameter value invalid! Lesser or equals to zero.");}
	}
	public void setSide3(double side3) throws ShapeException{
		if (side3 > 0) {		this.s3 = side3;}
		else { throw new ShapeException("Parameter value invalid! Lesser or equals to zero.");}
	}

	@Override
	public double calculatePerimeter() {
		return getSide1() + getSide2() + getSide3();
	}

	@Override
	public String toString() {
		return "Triangle {s1=" + getSide1() + ", s2=" + getSide2() + ", s3=" + getSide3() + "} perimeter = "
				+ String.format("%g", calculatePerimeter());
	}

}
