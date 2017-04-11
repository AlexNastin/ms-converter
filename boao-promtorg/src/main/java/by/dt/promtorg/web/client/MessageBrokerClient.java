package by.dt.promtorg.web.client;

import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.from.PurchaseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class MessageBrokerClient {

    private final RestTemplate restTemplate;

    @Value("${url.messagebroker}")
    private String urlBase;

    @Autowired
    public MessageBrokerClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendProducts(ProductWrapper products) {
        ResponseEntity<HttpStatus> response = restTemplate.postForEntity(urlBase, products, HttpStatus.class);
        System.out.println(response);
    }

    public void sendPurchases(PurchaseWrapper purchases) {
        ResponseEntity<HttpStatus> response = restTemplate.postForEntity(urlBase, purchases, HttpStatus.class);
        System.out.println(response);
    }
}
