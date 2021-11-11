package com.cg.spring.core.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Department;
import com.cg.spring.core.demo.model.Employee;
 
public class App4 {
 
 	public static void main(String[] args) {
 
       ApplicationContext context = new 
       ClassPathXmlApplicationContext("SpringConfig.xml");
       Employee emp = context.getBean("employee", Employee.class);
       System.out.println(emp.toString());
       Employee emp2 = context.getBean("employee2", Employee.class);
       System.out.println(emp2.toString());
 
   Department dept = context.getBean("d", Department.class);
   System.out.println(dept.toString());
       ((AbstractApplicationContext) context).close();
 	}
}
