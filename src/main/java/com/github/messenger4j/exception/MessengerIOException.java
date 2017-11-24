package com.github.messenger4j.exception;

import lombok.NonNull;

/**
 * @author Max Grabenhorst
 * @since 1.0.0
 */
public final class MessengerIOException extends Exception {

    private static final long serialVersionUID = 5743883961127235375L;

    public MessengerIOException(@NonNull Throwable cause) {
        super(cause);
    }
}