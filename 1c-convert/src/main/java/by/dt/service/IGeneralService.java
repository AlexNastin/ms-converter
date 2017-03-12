package by.dt.service;

import by.dt.entity.wrapper.ProductFinalWrapper;
import by.dt.web.entity.wrapper.ProductWrapper;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
public interface IGeneralService {

    ProductFinalWrapper convertToProductFinal(ProductWrapper productWrapper);
}
