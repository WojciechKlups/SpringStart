package beans.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static beans.producers.Producer.*;

@Component
@Producer(type = ProducerType.SIMPLE)
// @Primary  // określa pierwszeństwo beana w przypadku konfliktu. Lepiej użyć qualifiera
// @Qualifier ("simpleMessageProducer")
public class SimpleMessageProducer implements MessageProducer {

    @Autowired
    private Environment environment;

    @Override
    public String getMessage() {
        String messageExample = environment.getProperty("messageExample");
        return "Example message " + messageExample + " " + LocalDateTime.now();
    }
}
