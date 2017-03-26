package by.dt.service.impl;

import by.dt.entity.ProductFinal;
import by.dt.entity.StoreFinal;
import by.dt.entity.wrapper.ProductFinalWrapper;
import by.dt.service.IGeneralService;
import by.dt.web.entity.wrapper.ProductWrapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
@Service
public class GeneralService implements IGeneralService {

    @Override
    public ProductFinalWrapper convertToProductFinal(ProductWrapper productWrapper) {
        List<ProductFinal> productFinals = new ArrayList<>();
        productWrapper.getProducts().forEach(item -> {
            List<StoreFinal> storeFinals = new ArrayList<>();
            item.getStores().forEach(storeItem -> storeFinals.add(new StoreFinal(storeItem.getName())));
            productFinals.add(new ProductFinal(item.getBarcode(), item.getName(), item.getTypeUnit(), item.getPriceUnit(), item.getProducer(), item.getCountry(), storeFinals, item.getCategory()));
        });
        ProductFinalWrapper products = new ProductFinalWrapper(productFinals);
        products.setProcessDate(new Date());
        return products;
    }


}
