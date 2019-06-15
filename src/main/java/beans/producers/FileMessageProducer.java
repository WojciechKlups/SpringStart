package beans.producers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static beans.producers.Producer.*;

@Component
// @Qualifier ("fileMessageProducer")
@Producer(type = ProducerType.FILE)
public class FileMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message from FILE + " + LocalDateTime.now();
    }
}
