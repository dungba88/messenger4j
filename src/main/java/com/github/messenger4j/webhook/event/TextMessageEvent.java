package com.github.messenger4j.webhook.event;

import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;

/**
 * @author Max Grabenhorst
 * @since 1.0.0
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class TextMessageEvent extends BaseEvent {

    private final String messageId;
    private final String text;

    public TextMessageEvent(@NonNull String senderId, @NonNull String recipientId, @NonNull Instant timestamp,
                            @NonNull String messageId, @NonNull String text) {
        super(senderId, recipientId, timestamp);
        this.messageId = messageId;
        this.text = text;
    }

    public String messageId() {
        return messageId;
    }

    public String text() {
        return text;
    }
}
