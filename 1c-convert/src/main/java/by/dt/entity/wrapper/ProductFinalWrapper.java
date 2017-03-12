package by.dt.entity.wrapper;

import by.dt.entity.Metadata;
import by.dt.entity.ProductFinal;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 11.03.2017.
 */
public class ProductFinalWrapper extends Metadata {

    private List<ProductFinal> products;

    public ProductFinalWrapper() {
    }

    public ProductFinalWrapper(List<ProductFinal> products) {
        this.products = products;
    }

    public List<ProductFinal> getProducts() {
        return products;
    }

    @Override
    public Date getProcessDate() {
        return processDate;
    }

    @Override
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public void setProducts(List<ProductFinal> products) {
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
