package by.dt.service.impl;

import by.dt.entity.ProductFinalDTO;
import by.dt.entity.PurchaseFinalDTO;
import by.dt.entity.PurchaseProductFinalDTO;
import by.dt.entity.StoreFinalDTO;
import by.dt.entity.wrapper.ProductFinalWrapper;
import by.dt.entity.wrapper.PurchaseFinalWrapper;
import by.dt.service.IGeneralService;
import by.dt.web.entity.wrapper.ProductWrapper;
import by.dt.web.entity.wrapper.PurchaseWrapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
@Service
public class GeneralService implements IGeneralService {

    @Override
    public ProductFinalWrapper convertToProductFinal(ProductWrapper productWrapper) {
        List<ProductFinalDTO> productFinals = new ArrayList<>();
        productWrapper.getProducts().forEach(item -> {
            List<StoreFinalDTO> storeFinals = new ArrayList<>();
            item.getStores().forEach(storeItem -> storeFinals.add(new StoreFinalDTO(storeItem.getName())));
            productFinals.add(new ProductFinalDTO(item.getBarcode(), item.getName(), item.getTypeUnit(), item.getPriceUnit(), item.getManufacturer(), item.getCountry(), storeFinals, item.getCategory()));
        });
        ProductFinalWrapper products = new ProductFinalWrapper(productFinals);
        products.setProcessDate(LocalDate.now());
        return products;
    }

    @Override
    public PurchaseFinalWrapper convertToPurchaseFinal(PurchaseWrapper purchaseWrapper) {
        List<PurchaseFinalDTO> purchaseFinals = new ArrayList<>();
        purchaseWrapper.getPurchases().forEach(item -> {
            List<PurchaseProductFinalDTO> purchaseProductFinals = new ArrayList<>();
            item.getProducts().forEach(purchaseProductItem -> purchaseProductFinals.add(new PurchaseProductFinalDTO(purchaseProductItem.getBarcode(), purchaseProductItem.getQuantity(), purchaseProductItem.getPrice())));
            purchaseFinals.add(new PurchaseFinalDTO(item.getCheckNumber(), item.getCardID(), item.getDate(), item.getCash(), item.getNonCash(), purchaseProductFinals));
        });
        PurchaseFinalWrapper purchases = new PurchaseFinalWrapper(purchaseFinals);
        purchases.setProcessDate(LocalDate.now());
        return purchases;
    }
}
