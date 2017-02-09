package by.dt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Converter1CApplication {

	public static void main(String[] args) {
		SpringApplication.run(Converter1CApplication.class, args);
	}
}
