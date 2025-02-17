package com.assignment.question;

import lombok.Getter;
import lombok.NoArgsConstructor;

// DO NOT REMOVE THE NO-ARG CONSTRUCTOR ANNOTATION
@NoArgsConstructor
@Getter
public class TranslationRequest {
    private String sourceText;
    private String fromLang;
    private String toLang;
    private Double accuracyFactor;

    // CTORs
    public TranslationRequest(String sourceText, String fromLang, String toLang) {
        this.sourceText = sourceText;
        this.fromLang = fromLang;
        this.toLang = toLang;
    }

    public TranslationRequest(String sourceText, String fromLang, String toLang, Double accuracyFactor) {
        this(sourceText, fromLang, toLang);
        this.accuracyFactor = accuracyFactor;
    }
}