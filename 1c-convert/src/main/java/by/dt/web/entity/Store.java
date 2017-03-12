package by.dt.web.entity;

import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 12.03.2017.
 */
public class Store {

    private String name;

    public Store() {
    }

    public Store(String name) {
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
        Store store = (Store) o;
        return Objects.equals(name, store.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                '}';
    }
}
