package by.dt.promtorg;

import by.dt.promtorg.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableDiscoveryClient
@Import({WebConfig.class})
@ComponentScan("by.dt")
public class BoaoPromtorgApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoaoPromtorgApplication.class, args);
    }
}