package by.dt.promtorg.entity.to;

import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 11.03.2017.
 */
public class ProductDTO {

    private String barcode;
    private String name;
    private String typeUnit;
    private double priceUnit;
    private String producer;
    private String country;
    private List<StoreDTO> stores;
    private String category;

    public ProductDTO() {
    }

    public ProductDTO(String barcode, String name, String typeUnit, double priceUnit, String producer, String country, List<StoreDTO> stores, String category) {
        this.barcode = barcode;
        this.name = name;
        this.typeUnit = typeUnit;
        this.priceUnit = priceUnit;
        this.producer = producer;
        this.country = country;
        this.stores = stores;
        this.category = category;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeUnit() {
        return typeUnit;
    }

    public void setTypeUnit(String typeUnit) {
        this.typeUnit = typeUnit;
    }

    public double getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(double priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<StoreDTO> getStores() {
        return stores;
    }

    public void setStores(List<StoreDTO> stores) {
        this.stores = stores;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return Double.compare(that.priceUnit, priceUnit) == 0 &&
                Objects.equals(barcode, that.barcode) &&
                Objects.equals(name, that.name) &&
                Objects.equals(typeUnit, that.typeUnit) &&
                Objects.equals(producer, that.producer) &&
                Objects.equals(country, that.country) &&
                Objects.equals(stores, that.stores) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode, name, typeUnit, priceUnit, producer, country, stores, category);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductWrapper{");
        sb.append("barcode='").append(barcode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", typeUnit='").append(typeUnit).append('\'');
        sb.append(", priceUnit=").append(priceUnit);
        sb.append(", producer='").append(producer).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", stores=").append(stores);
        sb.append(", category='").append(category).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
