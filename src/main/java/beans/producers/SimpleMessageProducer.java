package beans.producers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static beans.producers.Producer.*;

@Component
@Producer(type = ProducerType.SIMPLE)
// @Primary  // określa pierwszeństwo beana w przypadku konfliktu. Lepiej użyć qualifiera
// @Qualifier ("simpleMessageProducer")
public class SimpleMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message + " + LocalDateTime.now();
    }
}
