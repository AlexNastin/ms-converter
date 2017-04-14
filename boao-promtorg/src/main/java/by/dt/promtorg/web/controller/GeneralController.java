package by.dt.promtorg.web.controller;

import by.dt.promtorg.entity.HttpMessage;
import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.from.PurchaseWrapper;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.entity.to.PurchasesDTO;
import by.dt.promtorg.service.GeneralService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/boao-promtorg/v1/convert")
public class GeneralController {

    private final GeneralService generalService;

    @Autowired
    private RabbitTemplate template;

    @Autowired
    public GeneralController(GeneralService generalService) {
        this.generalService = generalService;
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public ResponseEntity<HttpMessage> products(@RequestBody ProductsDTO products) {
        List<ProductWrapper> productWrappers = generalService.convertToProductWrapper(products);
        //todo

        template.setExchange("");
        template.convertAndSend("json");
        return null;
    }

    @RequestMapping(path = "/purchases", method = RequestMethod.POST)
    public ResponseEntity<HttpMessage> purchases(@RequestBody PurchasesDTO purchases) {
        List<PurchaseWrapper> purchaseWrappers = generalService.convertToPurchaseWrapper(purchases);
        //todo
        return null;
    }

}
