package org.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApplication {

	public static void main(String[] args) {
		// Triangle triangle = new Triangle();
		
		/*
		 * The new operator is not being used. The triangle instance is being
		 * obtained from the spring bean factory
		 */
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle= (Triangle) context.getBean("triangle-alias");
		triangle.draw();

	}

}
