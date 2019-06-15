package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "beans")
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

//    @Bean
//    public MessagePrinter getPrinter(){
//        final MessageProducer simpleMessageProducer = new SimpleMessageProducer();
//        return new MessagePrinter(simpleMessageProducer);
//    }
}
