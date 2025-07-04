package org.example;

import org.example.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
         ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
         Student st=(Student)context.getBean("s1");//cane give student too
          st.write_exam();

    }

}
