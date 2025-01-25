package com.example.griotoldlog.exception;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public abstract class GriotoldlogException extends RuntimeException {
    public final Map<String, String> validation = new HashMap<>();

    public GriotoldlogException(String message) {
        super(message);
    }

    public GriotoldlogException(String message, Throwable cause) {
        super(message, cause);
    }

    public abstract int getStatusCode();

    public void addValidation(String fieldName, String message) {
        validation.put(fieldName, message);
    }
}
