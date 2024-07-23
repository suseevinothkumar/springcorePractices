package org.example.ConfigBased.JavaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
//need to use Javabased when we are trying to use defined class
@Configuration
public class JavaConfiguration {

    @Bean(name = "date")
    public Date getDate(){
        Date date = new Date();
        return date;
    }
}
