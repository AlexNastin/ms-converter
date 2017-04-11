package by.dt.promtorg.service;

import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.from.PurchaseWrapper;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
public interface GeneralService {

    ProductWrapper convertToProductFinal(by.dt.promtorg.entity.to.wrapper.ProductWrapper productWrapper);

    PurchaseWrapper convertToPurchaseFinal(by.dt.promtorg.entity.to.wrapper.PurchaseWrapper purchaseWrapper);
}
