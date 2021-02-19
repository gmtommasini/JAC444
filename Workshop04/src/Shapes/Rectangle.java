package Shapes;

import Shapes.exceptions.ShapeException;

public class Rectangle extends Parallelogram {	
	
	public Rectangle(double w, double h) throws ShapeException	{
		super(w, h);
	}
	
	@Override
	public String toString() {
		return "Rectangle {w=" + getW() + ", h=" + getH() + "} perimeter = " + String.format("%g",calculatePerimeter());
	}

}
