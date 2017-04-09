package by.dt.promtorg.service.impl;

import by.dt.promtorg.entity.server.to.ProductDTO;
import by.dt.promtorg.entity.server.to.PurchaseDTO;
import by.dt.promtorg.entity.server.to.PurchaseProductDTO;
import by.dt.promtorg.entity.server.to.StoreDTO;
import by.dt.promtorg.entity.server.to.wrapper.ProductWrapper;
import by.dt.promtorg.entity.server.to.wrapper.PurchaseWrapper;
import by.dt.promtorg.service.GeneralService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
@Service
public class SimpleGeneralService implements GeneralService {

    @Override
    public ProductWrapper convertToProductFinal(by.dt.promtorg.entity.client.to.wrapper.ProductWrapper productWrapper) {
        List<ProductDTO> productFinals = new ArrayList<>();
        productWrapper.getProducts().forEach(item -> {
            List<StoreDTO> storeFinals = new ArrayList<>();
            item.getStores().forEach(storeItem -> storeFinals.add(new StoreDTO(storeItem.getName())));
            productFinals.add(new ProductDTO(item.getBarcode(), item.getName(), item.getTypeUnit(), item.getPriceUnit(), item.getProducer(), item.getCountry(), storeFinals, item.getCategory()));
        });
        ProductWrapper products = new ProductWrapper(productFinals);
        products.setProcessDate(LocalDate.now());
        return products;
    }

    @Override
    public PurchaseWrapper convertToPurchaseFinal(by.dt.promtorg.entity.client.to.wrapper.PurchaseWrapper purchaseWrapper) {
        List<PurchaseDTO> purchaseFinals = new ArrayList<>();
        purchaseWrapper.getPurchases().forEach(item -> {
            List<PurchaseProductDTO> purchaseProductFinals = new ArrayList<>();
            item.getProducts().forEach(purchaseProductItem -> purchaseProductFinals.add(new PurchaseProductDTO(purchaseProductItem.getBarcode(), purchaseProductItem.getQuantity(), purchaseProductItem.getPrice())));
            purchaseFinals.add(new PurchaseDTO(item.getCheckNumber(), item.getCardID(), item.getDate(), item.getCash(), item.getNonCash(), purchaseProductFinals));
        });
        PurchaseWrapper purchases = new PurchaseWrapper(purchaseFinals);
        purchases.setProcessDate(LocalDate.now());
        return purchases;
    }
}
