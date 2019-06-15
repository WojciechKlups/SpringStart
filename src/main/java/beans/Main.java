package beans;

public class Main {

    public static void main(String[] args) {

        final MessageProducer simpleMessageProducer = new SimpleMessageProducer();
        final MessageProducer fileMessageProducer = new FileMessageProducer();

        MessagePrinter simplePrinter = new MessagePrinter(simpleMessageProducer);
        simplePrinter.printMessage();

        MessagePrinter filePrinter = new MessagePrinter(fileMessageProducer);
        filePrinter.printMessage();

    }

}
