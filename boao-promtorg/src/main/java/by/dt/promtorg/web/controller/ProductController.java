package by.dt.promtorg.web.controller;

import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/boao-promtorg/v1/convert/products", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    private final GeneralService generalService;

    @Autowired
    public ProductController(GeneralService generalService) {
        this.generalService = generalService;
    }

    @PostMapping
    public  List<ProductWrapper>  saveProducts(@RequestBody ProductsDTO products) {
        List<ProductWrapper> productWrappers = generalService.convertToProductWrapper(products);
        generalService.sendRabbitMQ(productWrappers);
        return productWrappers;
    }
}
