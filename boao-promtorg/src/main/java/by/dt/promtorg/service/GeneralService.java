package by.dt.promtorg.service;

import by.dt.promtorg.entity.Entity;
import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.from.PurchaseWrapper;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.entity.to.PurchasesDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface GeneralService {

    List<ProductWrapper> convertToProductWrapper(ProductsDTO productsDTO);

    <T extends Entity> List<T> sendRabbitMQ(List<T> purchaseWrappers);

    List<PurchaseWrapper> convertToPurchaseWrapper(PurchasesDTO purchaseDTO);
}
