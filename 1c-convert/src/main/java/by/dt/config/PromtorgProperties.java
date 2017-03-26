package by.dt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PromtorgProperties {

    @Value("${app.client.product-url}")
    private String urlGatewayProduct;

    @Value("${app.client.purchase-url}")
    private String urlGatewayPurchase;

    public String getUrlGatewayProduct() {
        return urlGatewayProduct;
    }

    public void setUrlGatewayProduct(String urlGatewayProduct) {
        this.urlGatewayProduct = urlGatewayProduct;
    }

    public String getUrlGatewayPurchase() {
        return urlGatewayPurchase;
    }

    public void setUrlGatewayPurchase(String urlGatewayPurchase) {
        this.urlGatewayPurchase = urlGatewayPurchase;
    }
}
