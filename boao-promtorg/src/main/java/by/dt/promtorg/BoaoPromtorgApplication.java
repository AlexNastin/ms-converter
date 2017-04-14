package by.dt.promtorg;

import by.dt.promtorg.config.RabbitMQConfiguration;
import by.dt.promtorg.config.WebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
@Import({WebConfiguration.class, RabbitMQConfiguration.class})
@ComponentScan("by.dt")
public class BoaoPromtorgApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoaoPromtorgApplication.class, args);
    }
}
