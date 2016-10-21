package org.javabrains;

import javax.security.auth.Destroyable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean {
//public class Triangle implements ApplicationContextAware,BeanNameAware {

// Triangle object object1
	
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
		System.out.println("Trinagle Drawn with the below co-ordinates");
		System.out.println("Point: ( " + pointA.getX() + ", " + pointA.getY() + " )");
		System.out.println("Point: ( " + pointB.getX() + ", " + pointB.getY() + " )");
		System.out.println("Point: ( " + pointC.getX() + ", " + pointC.getY() + " )");
		
			

	}

	@Override
	public void setBeanName(String beanName) {
		System.err.println("Name of the bean: "+beanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println("Interface -- All the properties set for the Triangle Bean");
		
	}

	@Override
	public void destroy() throws Exception {
		System.err.println("Interface  -- Destroying the Triangle Bean");
		
	}
	
	public void myInit()
	{
		System.out.println("All the properties set for the Triangle Bean");
	}
	
	public void cleanUp()
	{
		System.out.println("All the properties ***Cleaned UP*** for the Triangle Bean");
	}

}
