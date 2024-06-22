package com.springcore.ref;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/springcoreconfig.xml");
        A temp = (A)context.getBean("aref");
        
        System.out.println("ID IS  :-  "+temp.getId());
        System.out.println("NAME IS  :-  "+temp.getName());
        System.out.println("CITY IS  :-  "+temp.getAddress().getCity());
        System.out.println("STATE IS  :-  "+temp.getAddress().getState());
        System.out.println("COUNTRY IS  :-  "+temp.getAddress().getCountry());
        
    }
}
