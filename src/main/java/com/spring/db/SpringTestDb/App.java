package com.spring.db.SpringTestDb;

import javax.swing.BoxLayout;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.db.SpringTestDb.entity.Student;
import com.spring.db.SpringTestDb.studentDao.StudentDaoClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
       StudentDaoClass template = context.getBean("studentDao", StudentDaoClass.class);
       
       
//       Student std = new Student();
//       std.setId(2);
//       std.setName("sanam");
//       std.setCity("ongole");
//       
//       int result = template.insert(std);
//       
//       Student std = new Student();
//       std.setId(2);
//       std.setName("sana");
//       std.setCity("cpt");
//       
//       int result = template.change(std);
       
       Student std = new Student();
       std.setId(2);    
       int result = template.delete(std);
       
       System.out.println("no of rows effected "+ result);
    }
}
