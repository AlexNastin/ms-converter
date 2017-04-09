package by.dt.promtorg.web.client;

import by.dt.promtorg.config.PromtorgProperties;
import by.dt.promtorg.entity.server.to.wrapper.ProductWrapper;
import by.dt.promtorg.entity.server.to.wrapper.PurchaseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
@Component
public class MessageBrokerClient {

    private final RestTemplate restTemplate;

    private final PromtorgProperties promtorgProperties;

    @Autowired
    public MessageBrokerClient(RestTemplate restTemplate, PromtorgProperties promtorgProperties) {
        this.restTemplate = restTemplate;
        this.promtorgProperties = promtorgProperties;
    }

    public void sendProducts(ProductWrapper products) {
        ResponseEntity<HttpStatus> response = restTemplate.postForEntity(promtorgProperties.getUrlGatewayProduct(), products, HttpStatus.class);
        System.out.println(response);
    }

    public void sendPurchases(PurchaseWrapper purchases) {
        ResponseEntity<HttpStatus> response = restTemplate.postForEntity(promtorgProperties.getUrlGatewayPurchase(), purchases, HttpStatus.class);
        System.out.println(response);
    }
}
