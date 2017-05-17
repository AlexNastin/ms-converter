package by.dt.promtorg.entity;

import org.springframework.http.HttpStatus;

import java.util.Objects;

public class HttpMessageCustom {

    private HttpStatus status;
    private String message;

    public HttpMessageCustom() {
    }

    public HttpMessageCustom(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpMessageCustom that = (HttpMessageCustom) o;
        return status == that.status &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HttpMessageCustom{");
        sb.append("status=").append(status);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
