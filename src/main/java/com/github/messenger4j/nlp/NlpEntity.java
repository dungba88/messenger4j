package com.github.messenger4j.nlp;

import lombok.Getter;

@Getter
public class NlpEntity {

    private final String name;
    
    private final String value;
    
    private final double confidence;
    
    public NlpEntity(String name, String value, double confidence) {
        this.name = name;
        this.value = value;
        this.confidence = confidence;
    }
}
