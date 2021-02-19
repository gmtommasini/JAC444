package Shapes;

import Shapes.exceptions.ShapeException;

/* this class is intended to build the shapes accordingly to an array of parameters with names and sizes
 * In this way, the application do not have to control sides and throw errors
 */

public class ShapesBuilder {
	public static Shape shapesBuilder(String[] args) throws Exception {
		Shape shape = null;

		if (args[0].equals("Circle") && args.length == 2) { // checking type and number of arguments
			if (Double.parseDouble(args[1]) > 0) {			// measures must be greater than zero
				shape = new Circle(Double.parseDouble(args[1]));
			} else {
				//System.out.println("Invalid radius!");
				throw new ShapeException("Invalid radius!");
			}
		} 
		
		else if (args[0].equals("Parallelogram") && args.length == 3) {
			if (Double.parseDouble(args[1]) > 0 && Double.parseDouble(args[2]) > 0) {
				shape = new Parallelogram(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			} else {
				//System.out.println("Invalid side(s)! para");
				throw new ShapeException("Invalid side(s)!");
			}
		} 		
		else if (args[0].equals("Rectangle") && args.length == 3) {
			if (Double.parseDouble(args[1]) > 0 && Double.parseDouble(args[2]) > 0) {
				shape = new Rectangle(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
			} else {
				//System.out.println("Invalid side(s)! rec");
				throw new ShapeException("Invalid side(s)!");
			}
		} 
		else if (args[0].equals("Square") && args.length == 2) {
			if (Double.parseDouble(args[1]) > 0) {
				shape = new Square(Double.parseDouble(args[1]));
			} else {
				//System.out.println("Invalid side!");
				throw new ShapeException("Invalid side!");
			}
		} 
		
		else if (args[0].equals("Triangle") && args.length == 4) {
			double	a = Double.parseDouble(args[1]), 
					b = Double.parseDouble(args[2]), 
					c = Double.parseDouble(args[3]); // easing  notation
			
			if (	(a > 0 && b > 0 && c > 0)// checking sides >0
				&&	(a + b > c && a + c > b && b + c > a)) { // the sum of two sides must be always greater than the third side.
				shape = new Triangle(a, b, c);
			} else {
				//System.out.println("Invalid side(s)!");
				throw new ShapeException("Invalid side(s)!");
			}
		} 
		
		else {
			//if it is not one of the shapes with the correct number of arguments
			throw new Exception(); 
		}
		
		return shape;
	}
}
