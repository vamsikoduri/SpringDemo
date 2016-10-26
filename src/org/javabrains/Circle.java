package org.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {

	Point center;
	private ApplicationEventPublisher publisher;

	@Autowired
	private MessageSource messageBean;

	public MessageSource getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(MessageSource messageBean) {
		this.messageBean = messageBean;
	}

	public Point getCenter() {
		return center;
	}

	/*
	 * @Autowired
	 * 
	 * @Required
	 * 
	 * @Qualifier("circleQualifier")
	 */
	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void afterInit() {
		System.out.println("*****After Initialization of Circle object ****");
	}

	@PreDestroy
	public void beforeDestroy() {
		System.out.println("*****Before destruction of Circle object ****");

	}

	@Override
	public void draw() {
		DrawEvent d = new DrawEvent(this);
		publisher.publishEvent(d);
		System.out.println(this.messageBean.getMessage("circle.draw", null, "DefaultGreetings From circel draw", null));
		System.out.println(this.messageBean.getMessage("point", new Object[] { center.getX(), center.getY() },
				"DefaultGreetings From Point", null));
		// System.out.println("Drawing a circle !!");
		// System.out.println("Point: ( " + center.getX() + ", " + center.getY()
		// + " )");
		System.out.println(this.messageBean.getMessage("greetings", null, "DefaultGreetings", null));
			}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;

	}

}
