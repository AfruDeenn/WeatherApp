package com.example.exception;

public class NewsApiException extends RuntimeException{
    public NewsApiException(String message) {
        super(message);
    }
    public NewsApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
