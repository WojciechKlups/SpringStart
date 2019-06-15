package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MessagePrinter {

    @Autowired  // wstrzykiwanie przez pole (jeśli jest dużo pól (żeby nie rozbudowywać konstruktora))
    @Qualifier("simpleMessageProducer")
    private MessageProducer messageProducer;

//    public MessagePrinter(MessageProducer messageProducer) {
//        this.messageProducer = messageProducer;
//    }

 //   private MessageProducer messageProducer;

//    @Autowired   //wstrzykiwanie przez konstruktor (zależności obowiązkowe dla danej klasy np. final)
//    public MessagePrinter (@Qualifier("simpleMessageProducer")MessageProducer messageProducer) {
//        this.messageProducer = messageProducer;
//    }

//    @Autowired  //wstrzykiwanie przez setter (zależności nieobowiązkowe)
//    public void setMessageProducer(MessageProducer messageProducer) {
//        this.messageProducer = messageProducer;
//    }

    public void printMessage() {
        final String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
