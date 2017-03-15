package by.dt.web.entity.wrapper;

import by.dt.web.entity.PurchaseDTO;

import java.util.List;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 15.03.2017.
 */
public class PurchaseWrapper {

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
        return "PurchaseWrapper{" +
                "purchases=" + purchases +
                '}';
    }
}
