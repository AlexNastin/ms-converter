package by.dt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PromtorgProperties {

    @Value("${app.client.url}")
    private String urlGateway;

    public String getUrlGateway() {
        return urlGateway;
    }

    public void setUrlGateway(String urlGateway) {
        this.urlGateway = urlGateway;
    }
}
