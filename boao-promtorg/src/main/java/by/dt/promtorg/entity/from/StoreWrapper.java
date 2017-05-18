package by.dt.promtorg.entity.from;

import by.dt.promtorg.entity.Entity;

import java.util.Objects;

/**
 * @author Nastin A
 * @version 1.0
 */
public class StoreWrapper implements Entity {

    private AddressWrapper address;

    public StoreWrapper() {
    }

    public StoreWrapper(AddressWrapper address) {
        this.address = address;
    }

    public AddressWrapper getAddress() {
        return address;
    }

    public void setAddress(AddressWrapper address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreWrapper storeDTO = (StoreWrapper) o;
        return Objects.equals(address, storeDTO.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StoreWrapper{");
        sb.append("address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
