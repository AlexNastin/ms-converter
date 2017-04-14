package by.dt.promtorg.web.listner;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {

    @RabbitListener(queues = "general")
    public void worker1(String message) {
        System.out.println("general " + message);
    }

    @RabbitListener(queues = "priority")
    public void worker2(String message) {
        System.out.println("priority " + message);
    }
}