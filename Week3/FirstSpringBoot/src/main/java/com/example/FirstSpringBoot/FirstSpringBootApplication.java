package com.example.FirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(FirstSpringBootApplication.class, args);//create a ioc container or spring container
		Student s=context.getBean(Student.class);//s will store ref of the student
		//scope of the class protype and singleton singleton is defult for this
//		s.age=11;
//		System.out.println(s.age);

		s.show();
		s.write();
//		Student s2=context.getBean(Student.class);//s will store ref of the student
		//scope of the class protype and singleton singleton is defult for this
		//s2.age=13;
//		System.out.println(s2.age);
//		s2.show();

	}

}
