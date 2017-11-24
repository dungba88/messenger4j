package com.github.messenger4j.exception;

import lombok.NonNull;

/**
 * @author Max Grabenhorst
 * @since 1.0.0
 */
public final class MessengerVerificationException extends Exception {

    private static final long serialVersionUID = -4610010588861146400L;

    public MessengerVerificationException(@NonNull String message) {
        super(message);
    }
}