package by.dt.promtorg.entity.server.to;

import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
public class StoreDTO {

    private String name;

    public StoreDTO() {
    }

    public StoreDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreDTO store = (StoreDTO) o;
        return Objects.equals(name, store.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StoreDTO{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
