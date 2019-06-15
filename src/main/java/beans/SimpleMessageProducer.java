package beans;

import java.time.LocalDateTime;

public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message + " + LocalDateTime.now();
    }
}
