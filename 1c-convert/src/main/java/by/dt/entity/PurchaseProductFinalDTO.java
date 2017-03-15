package by.dt.entity;

import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 15.03.2017.
 */
public class PurchaseProductFinalDTO {

    private String barcode;
    private double quantity;
    private double price;

    public PurchaseProductFinalDTO() {
    }

    public PurchaseProductFinalDTO(String barcode, double quantity, double price) {
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
        if (!(o instanceof PurchaseProductFinalDTO)) return false;
        PurchaseProductFinalDTO that = (PurchaseProductFinalDTO) o;
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
        return "PurchaseProductDTO{" +
                "barcode='" + barcode + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
