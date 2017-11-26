package com.github.messenger4j.nlp;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class NlpEntity implements Serializable {

    private static final long serialVersionUID = 7686163407525935673L;

    private final String name;
    
    private final String value;
    
    private final double confidence;
    
    public NlpEntity(String name, String value, double confidence) {
        this.name = name;
        this.value = value;
        this.confidence = confidence;
    }
}
