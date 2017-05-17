package by.dt.promtorg.web.controller;

import by.dt.promtorg.entity.HttpMessageCustom;
import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/boao-promtorg/v1/convert/products", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public  List<ProductWrapper>  saveProducts(@RequestBody ProductsDTO products) {
        List<ProductWrapper> productWrappers = productService.convertToProductWrapper(products);
        productWrappers.forEach(productWrapper -> System.out.println(productWrapper));
        return productWrappers;
    }
}
