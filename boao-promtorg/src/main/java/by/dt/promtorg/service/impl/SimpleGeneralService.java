package by.dt.promtorg.service.impl;

import by.dt.promtorg.entity.from.*;
import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.entity.to.PurchaseDTO;
import by.dt.promtorg.entity.to.PurchasesDTO;
import by.dt.promtorg.service.GeneralService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SimpleGeneralService implements GeneralService {

    @Override
    public List<ProductWrapper> convertToProductWrapper(ProductsDTO productsDTO) {
        List<ProductWrapper> productWrappers = new ArrayList<>();
//        productWrappers.forEach(item -> {
//            List<StoreWrapper> storeFinals = new ArrayList<>();
//            item.getStores().forEach(storeItem -> storeFinals.add(new StoreWrapper(storeItem.getName())));
//            productFinals.add(new ProductWrapper(item.getBarcode(), item.getName(), item.getTypeUnit(), item.getPriceUnit(), item.getProducer(), item.getCountry(), storeFinals, item.getCategory()));
//        });
//        ProductsWrapper products = new ProductsWrapper(productFinals);
//        products.setProcessDate(LocalDate.now());
        return productWrappers;
    }

    @Override
    public List<PurchaseWrapper> convertToPurchaseWrapper(PurchasesDTO purchasesDTO) {
        List<PurchaseWrapper> purchaseWrappers = new ArrayList<>();
//        purchaseWrapper.getPurchases().forEach(item -> {
//            List<PurchaseProductWrapper> purchaseProductFinals = new ArrayList<>();
//            item.getProducts().forEach(purchaseProductItem -> purchaseProductFinals.add(new PurchaseProductWrapper(purchaseProductItem.getBarcode(), purchaseProductItem.getQuantity(), purchaseProductItem.getPrice())));
//            purchaseFinals.add(new PurchaseWrapper(item.getCheckNumber(), item.getCardID(), item.getDate(), item.getCash(), item.getNonCash(), purchaseProductFinals));
//        });
//        PurchasesDTO purchases = new PurchasesDTO(purchaseFinals);
//        purchases.setProcessDate(LocalDate.now());
        return purchaseWrappers;
    }
}
