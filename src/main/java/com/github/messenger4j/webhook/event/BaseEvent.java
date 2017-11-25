package com.github.messenger4j.webhook.event;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author Max Grabenhorst
 * @since 1.0.0
 */
@ToString
@EqualsAndHashCode
public abstract class BaseEvent {

    private final String senderId;
    private final String recipientId;
    private final Instant timestamp;
    private final Map<String, Object> extendedProperties;

    BaseEvent(String senderId, String recipientId, Instant timestamp) {
        this.senderId = senderId;
        this.recipientId = recipientId;
        this.timestamp = timestamp;
        this.extendedProperties = new HashMap<>();
    }

    public String senderId() {
        return senderId;
    }

    public String recipientId() {
        return recipientId;
    }

    public Instant timestamp() {
        return timestamp;
    }
    
    public Map<String, Object> extendedProperties() {
        return extendedProperties;
    }
}
