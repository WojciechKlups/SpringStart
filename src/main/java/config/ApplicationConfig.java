package config;

import beans.MessagePrinter;
import beans.MessageProducer;
import beans.SimpleMessageProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ApplicationConfig {

//    @Bean
//    public MessagePrinter getPrinter(){
//        final MessageProducer simpleMessageProducer = new SimpleMessageProducer();
//        return new MessagePrinter(simpleMessageProducer);
//    }
}
