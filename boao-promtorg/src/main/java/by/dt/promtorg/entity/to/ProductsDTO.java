package by.dt.promtorg.entity.to;

import by.dt.promtorg.entity.Entity;

import java.util.List;
import java.util.Objects;

/**
 * @author Nastin A
 * @version 1.0
 */
public class ProductsDTO implements Entity {

    private List<ProductDTO> products;

    public ProductsDTO() {
    }

    public ProductsDTO(List<ProductDTO> products) {
        this.products = products;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsDTO that = (ProductsDTO) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductsDTO{");
        sb.append("products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}
