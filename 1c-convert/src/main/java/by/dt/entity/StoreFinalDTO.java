package by.dt.entity;

import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
public class StoreFinalDTO {

    private String name;

    public StoreFinalDTO() {
    }

    public StoreFinalDTO(String name) {
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
        StoreFinalDTO store = (StoreFinalDTO) o;
        return Objects.equals(name, store.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "StoreFinalDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
