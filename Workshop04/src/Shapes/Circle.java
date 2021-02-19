package Shapes;

import java.lang.Math;

import Shapes.exceptions.ShapeException;

public class Circle implements Shape {
	private double radius;

	//constructors
	public Circle(double radius) throws ShapeException {
		setRadius(radius);
	}
	
	//setter
	public void setRadius(double radius) throws ShapeException {
		if (radius > 0) {
			this.radius = radius;
		} else {
			throw new ShapeException("Parameter value invalid! Lesser or equals to zero.");
		}
	}
	
	//getter
	public double getRadius() {
		return radius;
	}


	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * getRadius();
	}

	@Override
	public String toString() {
		return "Circle {r=" + getRadius() + "} perimeter = " + String.format("%g", calculatePerimeter());
	}

}
