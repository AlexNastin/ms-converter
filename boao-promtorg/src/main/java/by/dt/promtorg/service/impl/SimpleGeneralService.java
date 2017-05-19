package by.dt.promtorg.service.impl;

import by.dt.promtorg.entity.Entity;
import by.dt.promtorg.entity.from.AddressWrapper;
import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.from.PurchaseWrapper;
import by.dt.promtorg.entity.from.StoreWrapper;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.entity.to.PurchasesDTO;
import by.dt.promtorg.service.GeneralService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class SimpleGeneralService implements GeneralService {

    private final RabbitTemplate rabbitTemplate;

    private final ObjectMapper objectMapper;

    @Autowired
    public SimpleGeneralService(RabbitTemplate rabbitTemplate, ObjectMapper objectMapper) {
        this.rabbitTemplate = rabbitTemplate;
        this.objectMapper = objectMapper;
    }

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
    public <T extends Entity> List<T> sendRabbitMQ(List<T> objects) {
        List<T> objectsError = new ArrayList<>();
        Random random = new Random();
        while (!objects.isEmpty()) {
            T t = objects.remove(0);
            String jsonObj = null;
            try {
                jsonObj = objectMapper.writeValueAsString(t);
                rabbitTemplate.convertAndSend("general", jsonObj, message -> {
                    MessageProperties messageProperties = message.getMessageProperties();
                    messageProperties.setTimestamp(new Date());
                    messageProperties.setType(t.getClass().getCanonicalName());
                    messageProperties.setAppId("boao-promtorg");
                    messageProperties.setMessageId(new UUID(random.nextLong(), random.nextLong()).toString());
                    return message;
                });
            } catch (JsonProcessingException e) {
                sendRabbitMQ(objects);//ToDO
            }
        }
        return null;
    }

    @Override
    public List<PurchaseWrapper> convertToPurchaseWrapper(PurchasesDTO purchasesDTO) {
        List<PurchaseWrapper> purchaseWrappers = new ArrayList<>();
        return purchaseWrappers;
    }
}
