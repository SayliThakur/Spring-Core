package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
        Collection collection = (Collection)context.getBean("collection");
        System.out.println("ID IS  :-  "+collection.getId());
        System.out.println("NAMES ARE  :-  "+collection.getName());
        System.out.println("ADDRESS ARE  :-  "+collection.getAddress());
        System.out.println("COURSES ARE  :-  "+collection.getCourse());
    }
}
