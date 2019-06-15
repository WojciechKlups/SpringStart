package beans;

public class MessagePrinter {

    private MessageProducer messageProducer = new SimpleMessageProducer();

    public void printMessage() {
        final String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
