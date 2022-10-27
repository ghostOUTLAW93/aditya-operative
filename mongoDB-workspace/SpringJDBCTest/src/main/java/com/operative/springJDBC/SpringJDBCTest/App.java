package com.operative.springJDBC.SpringJDBCTest;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDAO;
import com.dao.StudentDAOImpl;
import com.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
        StudentDAO stdao = (StudentDAO) context.getBean("studentDao");
        StudentDAOImpl studentDao = new StudentDAOImpl();
        
        Student stu = new Student();
//        stu.setId(1);
//        stu.setName("aditya");
////        StudentDAOImpl obj = new StudentDAOImpl();
//        int result =stdao.insert(stu);
//        System.out.println(result);
        
        
        //resolve error
//        Student s = studentDao.getStudent(1);
//        System.out.println(s.getId()+" "+s.getName());
        
        List<Student> students = studentDao.getAllStudent();
        for(Student s: students) {
        	System.out.println(s.getId()+" "+s.getName());
        }
    }
}
