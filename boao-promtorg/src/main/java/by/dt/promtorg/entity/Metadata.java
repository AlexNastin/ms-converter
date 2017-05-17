package by.dt.promtorg.entity;

import by.dt.promtorg.util.LocalDateDeserializer;
import by.dt.promtorg.util.LocalDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Metadata implements Entity {

    private static final long serialVersionUID = 1L;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    protected LocalDate processDate;

    public Metadata() {
    }

    public Metadata(LocalDate processDate) {
        this.processDate = processDate;
    }

    public LocalDate getProcessDate() {
        return processDate;
    }

    public void setProcessDate(LocalDate processDate) {
        this.processDate = processDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Metadata metadata = (Metadata) o;
        return Objects.equals(getProcessDate(), metadata.getProcessDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProcessDate());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Metadata{");
        sb.append("processDate=").append(processDate);
        sb.append('}');
        return sb.toString();
    }
}
