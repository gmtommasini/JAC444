package Shapes;

import Shapes.exceptions.ShapeException;

public class Parallelogram implements Shape {
	private double w;
	private double h;

	//Constructors
	public Parallelogram(double w, double h) throws ShapeException {
		if (w > 0 && h > 0) {
			setH(h);
			setW(w);
		} else {
			throw new ShapeException();
		}
	}
	public Parallelogram() {
		super();
	}

	//getters
	public double getW() {		return w;	}
	public double getH() {		return h;	}

	//setters
	public void setW(double w) throws ShapeException {
		if (w > 0) {
			this.w = w;
		} else {
			throw new ShapeException("Parameter value invalid! Lesser or equals to zero.");
		}
	}
	public void setH(double h) throws ShapeException {
		if (h > 0) {
			this.h = h;
		} else {
			throw new ShapeException("Parameter value invalid! Lesser or equals to zero.");
		}
	}

	
	//methods
	@Override
	public double calculatePerimeter() {
		return 2 * getW() + 2 * getH();
	}

	@Override
	public String toString() {
		return "Parallelogram {w=" + getW() + ", h=" + getH() + "} perimeter = " + String.format("%g", calculatePerimeter());
	}

}
