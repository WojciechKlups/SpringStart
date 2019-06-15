package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");
        MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
        messagePrinter.printMessage();
        context.close();

    }
}
