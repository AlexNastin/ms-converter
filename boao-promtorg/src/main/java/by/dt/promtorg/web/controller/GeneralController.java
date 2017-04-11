package by.dt.promtorg.web.controller;

import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.from.PurchaseWrapper;
import by.dt.promtorg.service.GeneralService;
import by.dt.promtorg.web.client.MessageBrokerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/boao-promtorg/v1/convert")
public class GeneralController {

    private final GeneralService generalService;
    private final MessageBrokerClient gatewaySender;

    @Autowired
    public GeneralController(GeneralService generalService, MessageBrokerClient gatewaySender) {
        this.generalService = generalService;
        this.gatewaySender = gatewaySender;
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public String products(@RequestBody by.dt.promtorg.entity.to.wrapper.ProductWrapper products) {
        ProductWrapper productWrapper = generalService.convertToProductFinal(products);
        gatewaySender.sendProducts(productWrapper);
        return "Send Products Good!";
    }

    @RequestMapping(path = "/purchases", method = RequestMethod.POST)
    public String purchases(@RequestBody by.dt.promtorg.entity.to.wrapper.PurchaseWrapper purchases) {
        PurchaseWrapper purchaseWrapper = generalService.convertToPurchaseFinal(purchases);
        gatewaySender.sendPurchases(purchaseWrapper);
        return "Send Purchases Good!";
    }
}
