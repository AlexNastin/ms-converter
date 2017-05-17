package by.dt.promtorg.entity.to;

import java.util.Objects;

/**
 * @author Nastin A
 * @version 1.0
 */
public class StoreDTO {

    private AddressDTO address;

    public StoreDTO() {
    }

    public StoreDTO(AddressDTO address) {
        this.address = address;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreDTO storeDTO = (StoreDTO) o;
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
