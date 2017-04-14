package by.dt.promtorg.entity.from;

import by.dt.promtorg.entity.Metadata;

import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
public class StoreWrapper extends Metadata {

    private String name;

    public StoreWrapper() {
    }

    public StoreWrapper(String name) {
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
        StoreWrapper store = (StoreWrapper) o;
        return Objects.equals(name, store.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StoreWrapper{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
