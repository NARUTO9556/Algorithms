package com.example.algorithms.Exception;

public class StorageIsFullException extends RuntimeException {
    public StorageIsFullException(String message) {
        super(message);
    }
}
