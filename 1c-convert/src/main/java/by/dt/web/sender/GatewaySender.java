package by.dt.web.sender;

import by.dt.config.PromtorgProperties;
import by.dt.entity.wrapper.ProductFinalWrapper;
import by.dt.entity.wrapper.PurchaseFinalWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
@Component
public class GatewaySender {

    private final PromtorgProperties promtorgProperties;

    @Autowired
    public GatewaySender(PromtorgProperties promtorgProperties) {
        this.promtorgProperties = promtorgProperties;
    }

    public void sendProducts(ProductFinalWrapper products) {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<HttpStatus> response = rt.postForEntity(promtorgProperties.getUrlGatewayProduct(), products, HttpStatus.class);
        System.out.println(response);
    }

    public void sendPurchases(PurchaseFinalWrapper purchases) {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<HttpStatus> response = rt.postForEntity(promtorgProperties.getUrlGatewayPurchase(), purchases, HttpStatus.class);
        System.out.println(response);
    }
}
