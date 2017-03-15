package by.dt.web.entity;

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
    private String manufacturer;
    private String country;
    private List<StoreDTO> stores;
    private String category;

    public ProductDTO() {
    }

    public ProductDTO(String barcode, String name, String typeUnit, double priceUnit, String manufacturer, String country, List<StoreDTO> stores, String category) {
        this.barcode = barcode;
        this.name = name;
        this.typeUnit = typeUnit;
        this.priceUnit = priceUnit;
        this.manufacturer = manufacturer;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
        ProductDTO product = (ProductDTO) o;
        return Double.compare(product.priceUnit, priceUnit) == 0 &&
                Objects.equals(barcode, product.barcode) &&
                Objects.equals(name, product.name) &&
                Objects.equals(typeUnit, product.typeUnit) &&
                Objects.equals(manufacturer, product.manufacturer) &&
                Objects.equals(country, product.country) &&
                Objects.equals(stores, product.stores) &&
                Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode, name, typeUnit, priceUnit, manufacturer, country, stores, category);
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                ", typeUnit='" + typeUnit + '\'' +
                ", priceUnit=" + priceUnit +
                ", manufacturer='" + manufacturer + '\'' +
                ", country='" + country + '\'' +
                ", stores=" + stores +
                ", category='" + category + '\'' +
                '}';
    }
}
