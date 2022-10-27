package com.operative.spring.Assignment_5_SpringBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c=  new ClassPathXmlApplicationContext("config.xml");
        Question q = (Question) c.getBean("que");
        
        q.display();
    }
}
