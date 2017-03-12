package by.dt.web.controller;

import by.dt.entity.wrapper.ProductFinalWrapper;
import by.dt.service.IGeneralService;
import by.dt.web.entity.wrapper.ProductWrapper;
import by.dt.web.sender.GatewaySender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/convert")
public class GeneralController {

    private final IGeneralService generalService;
    private final GatewaySender gatewaySender;

    @Autowired
    public GeneralController(IGeneralService generalService, GatewaySender gatewaySender) {
        this.generalService = generalService;
        this.gatewaySender = gatewaySender;
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String testGet() {
        return "Test Get Good!";
    }

    @RequestMapping(path = "/test", method = RequestMethod.POST)
    public ResponseEntity testPost(@RequestBody ProductFinalWrapper productFinalWrapper) {
        System.out.println(productFinalWrapper.getProcessDate());
        System.out.println("--------------------");
        productFinalWrapper.getProducts().forEach(System.out::println);
        return new ResponseEntity<HttpStatus>(HttpStatus.OK);
    }

    @RequestMapping(path = "/products", method = RequestMethod.POST)
    public String products(@RequestBody ProductWrapper products) {
        ProductFinalWrapper productFinalWrapper = generalService.convertToProductFinal(products);
        gatewaySender.sendProducts(productFinalWrapper);
        return "Send Good!";
    }
}
