package by.dt.promtorg.service.impl;

import by.dt.promtorg.entity.from.*;
import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.to.AddressDTO;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.entity.to.PurchasesDTO;
import by.dt.promtorg.service.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SimpleProductService implements ProductService {

    @Override
    public List<ProductWrapper> convertToProductWrapper(ProductsDTO productsDTO) {
        List<ProductWrapper> productWrappers = new ArrayList<>();
        productsDTO.getProducts().forEach(productDTO -> {
            ProductWrapper productWrapper = new ProductWrapper(LocalDate.now(), productDTO.getBarcode(), productDTO.getName(), productDTO.getTypeUnit(), productDTO.getPriceUnit(), productDTO.getProducer(), productDTO.getCountry(), null, productDTO.getCategory(), productDTO.getSubCategory());
            List<StoreWrapper> storesWrapper = new ArrayList<>();
            productDTO.getStores().forEach(storeDTO -> {
                AddressWrapper addressWrapper = new AddressWrapper();
                addressWrapper.setX(storeDTO.getAddress().getX());
                addressWrapper.setY(storeDTO.getAddress().getY());
                StoreWrapper storeWrapper = new StoreWrapper(addressWrapper);
                storesWrapper.add(storeWrapper);
            });
            productWrapper.setStores(storesWrapper);
            productWrappers.add(productWrapper);
        });
        return productWrappers;
    }

    @Override
    public List<PurchaseWrapper> convertToPurchaseWrapper(PurchasesDTO purchasesDTO) {
        List<PurchaseWrapper> purchaseWrappers = new ArrayList<>();
        return purchaseWrappers;
    }
}
