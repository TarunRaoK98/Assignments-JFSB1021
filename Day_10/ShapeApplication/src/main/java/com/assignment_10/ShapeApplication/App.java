package com.assignment_10.ShapeApplication;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

    	Line line = (Line) context.getBean("line");
    	System.out.println("Line Instance:");
    	System.out.println("Point 1: ("+line.getPoint1().getX()+", "+line.getPoint1().getY()+")");
    	System.out.println("Point 2: ("+line.getPoint2().getX()+", "+line.getPoint2().getY()+")");
    	
    	Triangle triangle = (Triangle) context.getBean("triangle");
    	System.out.println("Triangle Instance:");
    	System.out.println("Point 1: ("+triangle.getPoint1().getX()+", "+triangle.getPoint1().getY()+")");
    	System.out.println("Point 2: ("+triangle.getPoint2().getX()+", "+triangle.getPoint2().getY()+")");
    	System.out.println("Point 3: ("+triangle.getPoint3().getX()+", "+triangle.getPoint3().getY()+")");
    }
}
