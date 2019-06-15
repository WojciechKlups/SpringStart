package beans.producers;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class NumberMessageProducer implements MessageProducer{

    private int number;

    public NumberMessageProducer() {
        number = new Random().nextInt();
    }

    @Override
    public String getMessage() {
        return "number : " + number;
    }
}
