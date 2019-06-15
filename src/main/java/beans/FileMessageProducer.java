package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Qualifier ("fileMessageProducer")
public class FileMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message from FILE + " + LocalDateTime.now();
    }
}
