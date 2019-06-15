package beans.producers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

import static beans.producers.Producer.*;

@Component
// @Qualifier ("fileMessageProducer")
@Producer(type = ProducerType.FILE)
public class FileMessageProducer implements MessageProducer {

    @Value("${messageFileName}")
    private String messageFileName;

    @Override
    public String getMessage() {
        return "Example message from " + messageFileName + " " + LocalDateTime.now();
    }
}
