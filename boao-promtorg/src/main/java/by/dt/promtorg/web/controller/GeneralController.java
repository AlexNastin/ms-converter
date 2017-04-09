package by.dt.promtorg.web.controller;

import by.dt.promtorg.entity.server.to.wrapper.ProductWrapper;
import by.dt.promtorg.entity.server.to.wrapper.PurchaseWrapper;
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

    @RequestMapping(path = "/test/products", method = RequestMethod.POST)
    public ResponseEntity testProducts(@RequestBody ProductWrapper productWrapper) {
        System.out.println(productWrapper.getProcessDate());
        System.out.println("--------------------");
        productWrapper.getProducts().forEach(System.out::println);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @RequestMapping(path = "/test/purchases", method = RequestMethod.POST)
    public ResponseEntity testPurchases(@RequestBody PurchaseWrapper purchaseWrapper) {
        System.out.println(purchaseWrapper.getProcessDate());
        System.out.println("--------------------");
        purchaseWrapper.getPurchases().forEach(System.out::println);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public String products(@RequestBody by.dt.promtorg.entity.client.to.wrapper.ProductWrapper products) {
        ProductWrapper productWrapper = generalService.convertToProductFinal(products);
        gatewaySender.sendProducts(productWrapper);
        return "Send Products Good!";
    }

    @RequestMapping(path = "/purchases", method = RequestMethod.POST)
    public String purchases(@RequestBody by.dt.promtorg.entity.client.to.wrapper.PurchaseWrapper purchases) {
        PurchaseWrapper purchaseWrapper = generalService.convertToPurchaseFinal(purchases);
        gatewaySender.sendPurchases(purchaseWrapper);
        return "Send Purchases Good!";
    }
}
