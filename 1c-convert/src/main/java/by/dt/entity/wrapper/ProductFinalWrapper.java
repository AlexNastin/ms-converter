package by.dt.entity.wrapper;

import by.dt.entity.Metadata;
import by.dt.entity.ProductFinalDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 11.03.2017.
 */
public class ProductFinalWrapper extends Metadata {

    private List<ProductFinalDTO> products;

    public ProductFinalWrapper() {
    }

    public ProductFinalWrapper(List<ProductFinalDTO> products) {
        this.products = products;
    }

    public List<ProductFinalDTO> getProducts() {
        return products;
    }

    @Override
    public LocalDate getProcessDate() {
        return processDate;
    }

    @Override
    public void setProcessDate(LocalDate processDate) {
        this.processDate = processDate;
    }

    public void setProducts(List<ProductFinalDTO> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductFinalWrapper that = (ProductFinalWrapper) o;
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
