package beans;

public class MessagePrinter {

    private MessageProducer messageProducer;

    public MessagePrinter(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public void printMessage() {
        final String message = messageProducer.getMessage();
        System.out.println(message);
    }
}
