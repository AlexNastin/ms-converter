package by.dt.entity.wrapper;

import by.dt.entity.Metadata;
import by.dt.entity.PurchaseFinalDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 15.03.2017.
 */
public class PurchaseFinalWrapper extends Metadata {

    private List<PurchaseFinalDTO> purchases;

    public PurchaseFinalWrapper() {
    }

    public PurchaseFinalWrapper(List<PurchaseFinalDTO> purchases) {
        this.purchases = purchases;
    }

    public List<PurchaseFinalDTO> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<PurchaseFinalDTO> purchases) {
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
        if (!(o instanceof PurchaseFinalWrapper)) return false;
        PurchaseFinalWrapper that = (PurchaseFinalWrapper) o;
        return Objects.equals(purchases, that.purchases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchases);
    }

    @Override
    public String toString() {
        return "PurchaseWrapper{" +
                "purchases=" + purchases +
                '}';
    }
}
