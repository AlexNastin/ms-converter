package by.dt.entity;

import by.dt.util.LocalDateDeserializer;
import by.dt.util.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Stepanov Nickita (CreaRec) on 11.03.2017.
 */
public abstract class Metadata implements Entity {

    private static final long serialVersionUID = 1L;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    protected LocalDate processDate;

    public abstract LocalDate getProcessDate();

    public abstract void setProcessDate(LocalDate processDate);

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
