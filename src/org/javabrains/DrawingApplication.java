package org.javabrains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		// Triangle triangle = new Triangle();

		/*
		 * The new operator is not being used. The triangle instance is being
		 * obtained from the spring bean factory
		 */

		// BeanFactory factory = new XmlBeanFactory(newFileSystemResource("spring.xml"));

		// ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();

	}

}
