package com.amilcar.view;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amilcar.modelo.Auto;
import com.amilcar.modelo.Motor;

public class Test {

	public static void main(String[] args) {
		ApplicationContext aC = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Auto a =(Auto) aC.getBean("auto");
		a.setColor("rojo");
		a.setMarca("Ford");
		a.setModelo("ni idea");
		//System.out.println(a);
		
		Auto a2=(Auto) aC.getBean("auto");
		a2.setColor("amarillo");
		a2.setMarca("Renault");
		a2.setModelo("Zpsio");
		System.out.println(a2);
		
		System.out.println((Auto)aC.getBean("audi"));

		System.out.println((Motor)aC.getBean("motorDiesel"));
		System.out.println();
		System.out.println((Auto)aC.getBean("autoMotor"));
		
		
		
		((ConfigurableApplicationContext)aC).close();
	}

}
