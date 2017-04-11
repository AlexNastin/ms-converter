package by.dt.promtorg.entity.from;

import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 15.03.2017.
 */
public class PurchaseProductDTO {

    private String barcode;
    private double quantity;
    private double price;

    public PurchaseProductDTO() {
    }

    public PurchaseProductDTO(String barcode, double quantity, double price) {
        this.barcode = barcode;
        this.quantity = quantity;
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseProductDTO)) return false;
        PurchaseProductDTO that = (PurchaseProductDTO) o;
        return Double.compare(that.quantity, quantity) == 0 &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(barcode, that.barcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode, quantity, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurchaseProductDTO{");
        sb.append("barcode='").append(barcode).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
