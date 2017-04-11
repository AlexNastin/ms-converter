package by.dt.promtorg.entity.from;

import by.dt.promtorg.entity.Metadata;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 15.03.2017.
 */
public class PurchaseWrapper extends Metadata {

    private List<PurchaseDTO> purchases;

    public PurchaseWrapper() {
    }

    public PurchaseWrapper(List<PurchaseDTO> purchases) {
        this.purchases = purchases;
    }

    public List<PurchaseDTO> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<PurchaseDTO> purchases) {
        this.purchases = purchases;
    }

    @Override
    public LocalDate getProcessDate() {
        return processDate;
    }

    @Override
    public void setProcessDate(LocalDate processDate) {
        this.processDate = processDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseWrapper)) return false;
        PurchaseWrapper that = (PurchaseWrapper) o;
        return Objects.equals(purchases, that.purchases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchases);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurchaseWrapper{");
        sb.append("purchases=").append(purchases);
        sb.append('}');
        return sb.toString();
    }
}