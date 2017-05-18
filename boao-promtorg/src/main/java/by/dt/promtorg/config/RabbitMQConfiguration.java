package by.dt.promtorg.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
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

    @Value("${spring.rabbitmq.host}")
    private String host;

    @Value("${spring.rabbitmq.user}")
    private String user;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory(host);
        connectionFactory.setUsername(user);
        connectionFactory.setPassword(password);
        return connectionFactory;
    }

    @Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(connectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate() {
        return new RabbitTemplate(connectionFactory());
    }

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
