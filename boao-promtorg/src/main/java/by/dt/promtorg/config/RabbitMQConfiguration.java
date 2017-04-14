package by.dt.promtorg.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("default")
@Configuration
@EnableRabbit
public class RabbitMQConfiguration {

    @Value("${rabbitmq.names.general}")
    private String general;

    @Value("${rabbitmq.names.priority}")
    private String priority;

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Bean
    public Queue queueGeneral() {
        return new Queue(general);
    }

    @Bean
    public Queue queuePriority() {
        return new Queue(priority);
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(exchange);
    }

    @Bean
    public Binding bindingGeneral() {
        return BindingBuilder.bind(queueGeneral()).to(fanoutExchange());
    }

    @Bean
    public Binding bindingPriority() {
        return BindingBuilder.bind(queuePriority()).to(fanoutExchange());
    }
}
