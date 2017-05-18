package by.dt.promtorg.entity.to;

import by.dt.promtorg.entity.Entity;

import java.util.List;
import java.util.Objects;

/**
 * @author Nastin A
 * @version 1.0
 */
public class PurchasesDTO implements Entity {

    private List<PurchaseDTO> purchases;

    public PurchasesDTO() {
    }

    public PurchasesDTO(List<PurchaseDTO> purchases) {
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
        if (!(o instanceof PurchasesDTO)) return false;
        PurchasesDTO that = (PurchasesDTO) o;
        return Objects.equals(purchases, that.purchases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchases);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurchasesDTO{");
        sb.append("purchases=").append(purchases);
        sb.append('}');
        return sb.toString();
    }
}
