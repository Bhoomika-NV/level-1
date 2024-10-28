package org.kodnest.SpringFrameWork.AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main( String[] args )
	{

		ClassPathXmlApplicationContext ctx=new  ClassPathXmlApplicationContext("config.xml");

		Person p1 = (Person)ctx.getBean("per"); 
		System.out.println(p1);

		
		 /* Person p2 = (Person)ctx.getBean("per2");
		  System.out.println(p2);*/
		 
	}
}
