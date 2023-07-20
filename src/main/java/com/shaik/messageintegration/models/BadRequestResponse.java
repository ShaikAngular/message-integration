package com.shaik.messageintegration.models;

import java.util.Objects;
import javax.validation.constraints.Pattern;

public class BadRequestResponse {

    private String statusCode=null;
    private String errorCode=null;
    private String errorMessage=null;

    public BadRequestResponse(String statusCode, String errorCode, String errorMessage) {
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Pattern(regexp="^[A-za-z0-9 .-=]*$") public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Pattern(regexp="^[A-za-z0-9 .-=]*$") public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Pattern(regexp="^[A-za-z0-9 .-=]*$") public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "BadRequestResponse{" +
                "statusCode='" + statusCode + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BadRequestResponse that = (BadRequestResponse) o;
        return Objects.equals(statusCode, that.statusCode) && Objects.equals(errorCode, that.errorCode) && Objects.equals(errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, errorCode, errorMessage);
    }
}
