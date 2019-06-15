package application;

import beans.MessagePrinter;
import config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
//        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
//        messagePrinter.printMessage();
//        context.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();

    }
}
