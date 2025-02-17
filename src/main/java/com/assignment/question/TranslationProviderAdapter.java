package com.assignment.question;

import java.util.List;

// Target Interface - expected by the client
public interface TranslationProviderAdapter {
    public String translate(TranslationRequest request);
    public List<String> getSupportedLanguages();
}