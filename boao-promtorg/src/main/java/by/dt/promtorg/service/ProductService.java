package by.dt.promtorg.service;

import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.from.PurchaseWrapper;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.entity.to.PurchasesDTO;

import java.util.List;

public interface ProductService {

    List<ProductWrapper> convertToProductWrapper(ProductsDTO productsDTO);

    List<PurchaseWrapper> convertToPurchaseWrapper(PurchasesDTO purchaseDTO);
}
