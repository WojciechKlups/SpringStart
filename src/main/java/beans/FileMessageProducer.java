package beans;

import java.time.LocalDateTime;

public class FileMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        return "Example message from FILE + " + LocalDateTime.now();
    }
}
