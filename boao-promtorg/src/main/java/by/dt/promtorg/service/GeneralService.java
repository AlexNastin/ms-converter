package by.dt.promtorg.service;

import by.dt.promtorg.entity.server.to.wrapper.ProductWrapper;
import by.dt.promtorg.entity.server.to.wrapper.PurchaseWrapper;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
public interface GeneralService {

    ProductWrapper convertToProductFinal(by.dt.promtorg.entity.client.to.wrapper.ProductWrapper productWrapper);

    PurchaseWrapper convertToPurchaseFinal(by.dt.promtorg.entity.client.to.wrapper.PurchaseWrapper purchaseWrapper);
}
