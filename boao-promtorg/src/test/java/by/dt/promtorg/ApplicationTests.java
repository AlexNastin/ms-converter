package by.dt.promtorg;

import by.dt.promtorg.entity.to.AddressDTO;
import by.dt.promtorg.entity.to.ProductDTO;
import by.dt.promtorg.entity.to.ProductsDTO;
import by.dt.promtorg.entity.to.StoreDTO;
import javafx.util.Pair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void contextLoads() {
        ProductsDTO productsDTO = new ProductsDTO();
        List<StoreDTO> storeDTOList = new ArrayList<>();
        StoreDTO storeDTO = new StoreDTO();
        AddressDTO addressDTO = new AddressDTO("x1", "y1");
        storeDTO.setAddress(addressDTO);
        storeDTOList.add(storeDTO);
        List<ProductDTO> productDTOS = new ArrayList<>();
        ProductDTO productDTO1 = new ProductDTO("barcode1", "name1", "typeUnit1", 4.5, "producer1", "country1", storeDTOList, "category1", "subCategory1");
        ProductDTO productDTO2 = new ProductDTO("barcode2", "name2", "typeUnit2", 5.5, "producer2", "country2", storeDTOList, "category2", "subCategory2");
        ProductDTO productDTO3 = new ProductDTO("barcode3", "name3", "typeUnit3", 6.5, "producer3", "country3", storeDTOList, "category3", "subCategory3");
        productDTOS.add(productDTO1);
        productDTOS.add(productDTO2);
        productDTOS.add(productDTO3);
        productsDTO.setProducts(productDTOS);
    }

}
