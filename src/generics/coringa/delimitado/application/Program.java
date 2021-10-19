package generics.coringa.delimitado.application;

import java.util.ArrayList;
import java.util.List;

import generics.coringa.delimitado.entities.Circle;
import generics.coringa.delimitado.entities.Rectangle;
import generics.coringa.delimitado.entities.Shape;

public class Program {

	 public static void main(String[] args) {
	
		 List<Shape> shapes = new ArrayList<Shape>();
		 shapes.add(new Rectangle(3.0,  2.0));
		 shapes.add(new Circle(2.0));
		 
		 List<Circle> circles = new ArrayList<Circle>();
		 circles.add(new Circle(2.0));
		 circles.add(new Circle(3.0));
		 
		 System.out.println("Total area: " + totalArea(shapes));
		 System.out.println("Total area: " + totalArea(circles));
		 
	}
	 
	 public static double totalArea(List<? extends Shape> list) {
		 double sum = 0.0;
		 for(Shape shape : list) {
			 sum += shape.area();
		 }
		 return sum;
	 }
	 
}
