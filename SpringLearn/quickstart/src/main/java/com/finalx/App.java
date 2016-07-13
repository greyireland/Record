package com.finalx;

import org.junit.Test;
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
    }

    @Test
    public void hello() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();

        System.out.println("hello world,this is test");
    }
}
