package Main;

/*
 * JAC444NCC - Workshop 3	2021/02/15
 * Code by: Guilherme Matsumoto Tommasini
 * ID: 167561182
 * */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import Shapes.*;
import Shapes.exceptions.ShapeException;

public class Main {

	public static void main(String[] args) {
		String fileName = "shapes.txt"; // get from args in the future
		int numberOfLines = 0;
		System.out.println("------->JAC 444 Assignment 1<-------\r\n------->Task 1 ... <-------");
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			while (br.readLine() != null) { // counting lines in the file
				numberOfLines++;
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
		}

		String s;
		Shape shapesArray[] = new Shape[numberOfLines]; // array sized accordingly to the file size
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			for (int i = 0; (s = br.readLine()) != null;) {
				String[] tokens = s.split(",");
				try {
					// shapesBuilder will verify all the parameters in tokens to guarantee integrity
					shapesArray[i] = ShapesBuilder.shapesBuilder(tokens);
					i++;
				} catch (ShapeException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					// System.out.println(e.getMessage());
					// doing nothing right now
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// End of data loading

		/**** TASK 1 ****/
		System.out.println();
		int counter = 0;
		// counting valid shapes
		for (Shape sh : shapesArray)
			if (sh != null)
				counter++;
		System.out.println(counter + " shapes were created:");
		// printing shapes
		for (int i = 0; i < counter; i++)
			System.out.println(shapesArray[i] + "\n");

		/**** TASK 2 ****/
		System.out.println("\n------->Task 2 ... <-------");
		double minPerTri = Double.MAX_VALUE, maxPerCir = 0;
		// //testing
		// for(Shape sh : shapesArray) { System.out.println(sh.getClass().getName()); }
		
		// finding larger circle and smaller triangle
		for (Shape sh : shapesArray) {
			if (sh instanceof Circle) {
				double max = sh.calculatePerimeter();
				if (max > maxPerCir) {
					maxPerCir = max;
				}
			} else if (sh instanceof Triangle) {
				double min = sh.calculatePerimeter();
				if (min < minPerTri) {
					minPerTri = min;
				}
			}
		}
		
		// deleting larger circle and smaller triangle
		for (int i = 0; i < shapesArray.length; i++) {
			if (shapesArray[i] instanceof Circle && shapesArray[i].calculatePerimeter() == maxPerCir) {
				shapesArray[i] = null;
			} else if (shapesArray[i] instanceof Triangle && shapesArray[i].calculatePerimeter() == minPerTri) {
				shapesArray[i] = null;
			}
		}
//		for (Shape sh : shapesArray) { //does not work for deleting because sh is a copy of the reference
//			if (sh instanceof Circle && sh.calculatePerimeter() == maxPerCir) {
//				sh = null;
//			} else ... 
//		}
		// printing shapes
		for (Shape sh : shapesArray) {
			if (sh != null) {
				System.out.println(sh);
				System.out.println();
			}
		}
		
		/**** TASK 3 ****/
		//Calculate and print the total perimeter of all parallelograms and the total perimeter of all triangles.
		System.out.println("------->Task 3 ... <-------");
		double totalPerimeterTriangles=0, totalPerimeterParallelograms = 0;		
		for (Shape sh : shapesArray) {
			if (sh instanceof Parallelogram && !(sh instanceof Rectangle) ) {
				totalPerimeterParallelograms += sh.calculatePerimeter();
			} else if (sh instanceof Triangle) {
				totalPerimeterTriangles += sh.calculatePerimeter();
			}
		}
		
		System.out.println("Total perimeter of Parallelogram is: "+ totalPerimeterParallelograms + 
		"\nTotal perimeter of Triangle is: "+ totalPerimeterTriangles);
		
//		Square one = new Square(10);
//		one.setW(3);
//		one.setH(5);
//		System.out.println(one);

	}

}
