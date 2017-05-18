package by.dt.promtorg.service.impl;

import by.dt.promtorg.entity.Entity;
import by.dt.promtorg.entity.from.AddressWrapper;
import by.dt.promtorg.entity.from.ProductWrapper;
import by.dt.promtorg.entity.from.PurchaseWrapper;
import by.dt.promtorg.entity.from.StoreWrapper;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.entity.to.PurchasesDTO;
import by.dt.promtorg.service.GeneralService;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SimpleGeneralService implements GeneralService {

    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public SimpleGeneralService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
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
    public <T extends Entity> boolean sendRabbitMQ(List<T> purchaseWrappers) {
        while (!purchaseWrappers.isEmpty()) {
            T t = purchaseWrappers.remove(0);
            rabbitTemplate.convertAndSend("general", t, new MessagePostProcessor() {
                @Override
                public Message postProcessMessage(Message message) throws AmqpException {
                    System.out.println("!!!!!!! " + message);
                    System.out.println("@@@@@@@ " + message.getBody());
                    System.out.println("&&&&&&& " + message.getMessageProperties());
                    ByteArrayInputStream inputStreamReader = new ByteArrayInputStream(message.getBody());
                    try {
                        ObjectInputStream ois = new ObjectInputStream(inputStreamReader);
                        ProductWrapper productWrapper = (ProductWrapper) ois.readObject();
                        System.out.println("%%%%%%%%" + productWrapper);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    return message;
                }
            });
        }
        return false;
    }

    @Override
    public List<PurchaseWrapper> convertToPurchaseWrapper(PurchasesDTO purchasesDTO) {
        List<PurchaseWrapper> purchaseWrappers = new ArrayList<>();
        return purchaseWrappers;
    }
}
