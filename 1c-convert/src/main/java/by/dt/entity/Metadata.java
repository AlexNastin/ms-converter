package by.dt.entity;

import java.util.Date;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 11.03.2017.
 */
public abstract class Metadata implements Entity {

    private static final long serialVersionUID = 1L;

    protected Date processDate;

    public abstract Date getProcessDate();

    public abstract void setProcessDate(Date processDate);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Metadata that = (Metadata) o;
        return Objects.equals(processDate, that.processDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processDate);
    }

    @Override
    public String toString() {
        return "MetadataResponse{" +
                "processDate=" + processDate +
                '}';
    }
}
