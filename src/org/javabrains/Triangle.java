package org.javabrains;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw() {
		System.err.println("Trinagle Drawn with the below co-ordinates");
		System.err.println("Point: ( " + pointA.getX() + ", " + pointA.getY() + " )");
		System.err.println("Point: ( " + pointB.getX() + ", " + pointB.getY() + " )");
		System.err.println("Point: ( " + pointC.getX() + ", " + pointC.getY() + " )");
		
			

	}

	@Override
	public void setBeanName(String beanName) {
		System.err.println("Name of the bean: "+beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
	}

}
