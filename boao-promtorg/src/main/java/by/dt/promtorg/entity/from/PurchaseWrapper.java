package by.dt.promtorg.entity.from;

import by.dt.promtorg.entity.Metadata;
import by.dt.promtorg.util.LocalDateSerializer;
import by.dt.promtorg.util.LocalDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author Nastin A
 * @version 1.0
 */
public class PurchaseWrapper extends Metadata {

    private String checkNumber;
    private String cardID;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;
    private double cash;
    private double nonCash;
    private List<PurchaseProductWrapper> purchaseProducts;

    public PurchaseWrapper() {
    }

    public PurchaseWrapper(String checkNumber, String cardID, LocalDate date, double cash, double nonCash, List<PurchaseProductWrapper> purchaseProducts) {
        this.checkNumber = checkNumber;
        this.cardID = cardID;
        this.date = date;
        this.cash = cash;
        this.nonCash = nonCash;
        this.purchaseProducts = purchaseProducts;
    }

    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public double getNonCash() {
        return nonCash;
    }

    public void setNonCash(double nonCash) {
        this.nonCash = nonCash;
    }

    public List<PurchaseProductWrapper> getPurchaseProducts() {
        return purchaseProducts;
    }

    public void setPurchaseProducts(List<PurchaseProductWrapper> purchaseProducts) {
        this.purchaseProducts = purchaseProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseWrapper)) return false;
        PurchaseWrapper that = (PurchaseWrapper) o;
        return Double.compare(that.cash, cash) == 0 &&
                Double.compare(that.nonCash, nonCash) == 0 &&
                Objects.equals(checkNumber, that.checkNumber) &&
                Objects.equals(cardID, that.cardID) &&
                Objects.equals(date, that.date) &&
                Objects.equals(purchaseProducts, that.purchaseProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkNumber, cardID, date, cash, nonCash, purchaseProducts);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurchaseWrapper{");
        sb.append("checkNumber='").append(checkNumber).append('\'');
        sb.append(", cardID='").append(cardID).append('\'');
        sb.append(", date=").append(date);
        sb.append(", cash=").append(cash);
        sb.append(", nonCash=").append(nonCash);
        sb.append(", purchaseProducts=").append(purchaseProducts);
        sb.append('}');
        return sb.toString();
    }
}
