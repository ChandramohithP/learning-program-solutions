package org.example.config;

import org.example.Pen;
import org.example.Pencil;
import org.example.Student;
import org.example.Writer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {
    @Bean(name="s1")
    public Student student(@Qualifier("pencil") Writer writer)//qual>primary
        {
            Student st=new Student();
            st.setRno(33);
            st.setWriter(writer);
            return st;
        }
        @Bean
        @Primary

    public Pen pen(){
        return new Pen();
        }
        @Bean

    public Pencil pencil()
        {
        return new Pencil();
        }


}
