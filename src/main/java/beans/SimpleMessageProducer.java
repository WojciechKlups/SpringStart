package beans;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message + " + LocalDateTime.now();
    }
}
