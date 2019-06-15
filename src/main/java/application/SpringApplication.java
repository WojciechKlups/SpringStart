package application;

import beans.printers.MessagePrinter;
import beans.producers.NumberMessageProducer;
import config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
//        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
//        messagePrinter.printMessage();
//        context.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();

        NumberMessageProducer numberMessageProducer = context.getBean(NumberMessageProducer.class);
        System.out.println(numberMessageProducer.getMessage());

        NumberMessageProducer numberMessageProducer2 = context.getBean(NumberMessageProducer.class);
        System.out.println(numberMessageProducer2.getMessage());

    }
}
