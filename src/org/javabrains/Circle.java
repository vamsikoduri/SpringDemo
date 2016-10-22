package org.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	Point center;
	
	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleQualifier")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle !!");
		System.out.println("Point: ( " + center.getX() + ", " + center.getY() + " )");
	}

	
	
}
