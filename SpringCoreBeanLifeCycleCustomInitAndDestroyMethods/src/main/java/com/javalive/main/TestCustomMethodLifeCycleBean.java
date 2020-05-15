package com.javalive.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalive.beans.CustomLifeCycleMethodBean;

public class TestCustomMethodLifeCycleBean {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		CustomLifeCycleMethodBean bean = (CustomLifeCycleMethodBean) context.getBean("customLifeCycleMethodBean");
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}
