package by.dt.entity;

import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 11.03.2017.
 */
public class ProductFinal {

    private String barcode;
    private String name;
    private String typeUnit;
    private double priceUnit;
    private String manufacturer;
    private String country;
    private List<StoreFinal> stores;
    private String category;

    public ProductFinal() {
    }

    public ProductFinal(String barcode, String name, String typeUnit, double priceUnit, String manufacturer, String country, List<StoreFinal> stores, String category) {
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

    public List<StoreFinal> getStores() {
        return stores;
    }

    public void setStores(List<StoreFinal> stores) {
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
        ProductFinal that = (ProductFinal) o;
        return Double.compare(that.priceUnit, priceUnit) == 0 &&
                Objects.equals(barcode, that.barcode) &&
                Objects.equals(name, that.name) &&
                Objects.equals(typeUnit, that.typeUnit) &&
                Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(country, that.country) &&
                Objects.equals(stores, that.stores) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode, name, typeUnit, priceUnit, manufacturer, country, stores, category);
    }

    @Override
    public String toString() {
        return "ProductFinal{" +
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
