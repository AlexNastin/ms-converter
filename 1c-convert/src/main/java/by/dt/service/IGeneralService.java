package by.dt.service;

import by.dt.entity.wrapper.ProductFinalWrapper;
import by.dt.entity.wrapper.PurchaseFinalWrapper;
import by.dt.web.entity.wrapper.ProductWrapper;
import by.dt.web.entity.wrapper.PurchaseWrapper;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
public interface IGeneralService {

    ProductFinalWrapper convertToProductFinal(ProductWrapper productWrapper);

    PurchaseFinalWrapper convertToPurchaseFinal(PurchaseWrapper purchaseWrapper);
}
