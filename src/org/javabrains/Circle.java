package org.javabrains;

public class Circle implements Shape {

	Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle !!");
		System.out.println("Point: ( " + center.getX() + ", " + center.getY() + " )");
	}

	
	
}
