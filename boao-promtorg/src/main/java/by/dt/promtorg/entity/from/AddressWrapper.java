package by.dt.promtorg.entity.from;

import by.dt.promtorg.entity.Entity;

import java.security.spec.ECField;
import java.util.Objects;

/**
 * @author Nastin A
 * @version 1.0
 */
public class AddressWrapper implements Entity {

    private String x;
    private String y;

    public AddressWrapper() {
    }

    public AddressWrapper(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressWrapper that = (AddressWrapper) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressWrapper{");
        sb.append("x='").append(x).append('\'');
        sb.append(", y='").append(y).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
