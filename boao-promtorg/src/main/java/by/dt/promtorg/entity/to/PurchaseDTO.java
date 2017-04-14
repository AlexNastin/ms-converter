package by.dt.promtorg.entity.to;

import by.dt.promtorg.util.LocalDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 15.03.2017.
 */
public class PurchaseDTO {

    private String checkNumber;
    private String cardID;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate date;
    private double cash;
    private double nonCash;
    private List<PurchaseProductDTO> products;

    public PurchaseDTO() {
    }

    public PurchaseDTO(String checkNumber, String cardID, LocalDate date, double cash, double nonCash, List<PurchaseProductDTO> products) {
        this.checkNumber = checkNumber;
        this.cardID = cardID;
        this.date = date;
        this.cash = cash;
        this.nonCash = nonCash;
        this.products = products;
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

    public List<PurchaseProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<PurchaseProductDTO> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseDTO that = (PurchaseDTO) o;
        return Double.compare(that.cash, cash) == 0 &&
                Double.compare(that.nonCash, nonCash) == 0 &&
                Objects.equals(checkNumber, that.checkNumber) &&
                Objects.equals(cardID, that.cardID) &&
                Objects.equals(date, that.date) &&
                Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkNumber, cardID, date, cash, nonCash, products);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurchaseWrapper{");
        sb.append("checkNumber='").append(checkNumber).append('\'');
        sb.append(", cardID='").append(cardID).append('\'');
        sb.append(", date=").append(date);
        sb.append(", cash=").append(cash);
        sb.append(", nonCash=").append(nonCash);
        sb.append(", products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}
