package Shapes;

import Shapes.exceptions.ShapeException;

public class Square implements Shape {
	private double side;

	public Square(double s) throws ShapeException {
		setSide(s);
	}

	// getters
	public double getSide() {
		return side;
	}

	// setters
	public void setSide(double s) throws ShapeException {
		if (s > 0) {
			this.side = s;
		} else {
			throw new ShapeException("Parameter value invalid! Lesser or equals to zero.");
		}

	}
	//methods
	@Override
	public double calculatePerimeter() {
		return 4 * getSide();
	}

	@Override
	public String toString() {
		return "Square {s=" + getSide() + "} perimeter = " + String.format("%g", calculatePerimeter());
		// return String.format("Square {s=%f} perimeter = %g", getW(), getPerimeter());
	}
}
