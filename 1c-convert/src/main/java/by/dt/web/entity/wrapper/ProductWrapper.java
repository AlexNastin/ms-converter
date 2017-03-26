package by.dt.web.entity.wrapper;

import by.dt.web.entity.Product;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 11.03.2017.
 */
public class ProductWrapper {

    private List<Product> products;

    public ProductWrapper() {
    }

    public ProductWrapper(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductWrapper that = (ProductWrapper) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ProductFinalWrapper{" +
                "products=" + products +
                '}';
    }
}
