package com.operative.spring.SpringTest;

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
    	//BeanFactory is used to develop mobile apps
    	//ApplicationContext is used to develop laptop apps
        ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
//        Student stu = (Student) c.getBean("st");
//        stu.show();
        
//        Question q = (Question) c.getBean("ques");
//        q.display();
        
        Student stu = (Student) c.getBean("stud");
        System.out.println(stu);
    }
}
