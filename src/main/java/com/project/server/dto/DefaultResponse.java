package com.project.server.dto;

import org.springframework.http.HttpStatus;

public class DefaultResponse<T> {
    private String message;
    private int status;
    private T data;

    public DefaultResponse(String message, HttpStatus status) {
        this.message = message;
        this.status = status.value();
        this.data = null;
    }

    public DefaultResponse(String message, HttpStatus status, T data) {
        this.message = message;
        this.status = status.value();
        this.data = data;
    }
}
