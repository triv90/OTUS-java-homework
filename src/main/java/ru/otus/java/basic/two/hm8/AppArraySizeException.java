package ru.otus.java.basic.two.hm8;

public class AppArraySizeException extends RuntimeException {
    public AppArraySizeException() {
    }

    public AppArraySizeException(String message) {
        super(message);
    }

    public AppArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppArraySizeException(Throwable cause) {
        super(cause);
    }

    public AppArraySizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

