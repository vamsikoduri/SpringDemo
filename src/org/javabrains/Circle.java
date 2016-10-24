package org.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	Point center;
	
	public Point getCenter() {
		return center;
	}

	/*@Autowired
	@Required
	@Qualifier("circleQualifier")*/
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	
	@PostConstruct
	public void afterInit()
	{
	System.out.println("*****After Initialization of Circle object ****");	
	}
	
	@PreDestroy
	public void beforeDestroy()
	{
		System.out.println("*****Before destruction of Circle object ****");	
			
	}
	
	
	@Override
	public void draw() {
		System.out.println("Drawing a circle !!");
		System.out.println("Point: ( " + center.getX() + ", " + center.getY() + " )");
	}

	
	
}
