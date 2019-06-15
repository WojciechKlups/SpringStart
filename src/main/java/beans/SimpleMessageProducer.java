package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
// @Primary  // określa pierwszeństwo beana w przypadku konfliktu. Lepiej użyć qualifiera
@Qualifier ("simpleMessageProducer")
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message + " + LocalDateTime.now();
    }
}
