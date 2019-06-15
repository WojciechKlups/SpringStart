package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessagePrinter {

    @Autowired  // wstrzykiwanie przez pole
    private MessageProducer messageProducer;

//    public MessagePrinter(MessageProducer messageProducer) {
//        this.messageProducer = messageProducer;
//    }

    public void printMessage() {
        final String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
