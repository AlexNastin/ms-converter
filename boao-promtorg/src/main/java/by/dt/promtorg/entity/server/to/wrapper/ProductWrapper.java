package by.dt.promtorg.entity.server.to.wrapper;

import by.dt.promtorg.entity.Metadata;
import by.dt.promtorg.entity.server.to.ProductDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 11.03.2017.
 */
public class ProductWrapper extends Metadata {

    private List<ProductDTO> products;

    public ProductWrapper() {
    }

    public ProductWrapper(List<ProductDTO> products) {
        this.products = products;
    }

    public List<ProductDTO> getProducts() {
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

    public void setProducts(List<ProductDTO> products) {
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
        final StringBuilder sb = new StringBuilder("ProductWrapper{");
        sb.append("products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}
