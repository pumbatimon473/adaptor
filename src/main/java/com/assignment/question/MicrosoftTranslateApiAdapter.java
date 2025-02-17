package com.assignment.question;

import java.util.List;

import com.assignment.question.external.MicrosoftTranslateApi;

public class MicrosoftTranslateApiAdapter implements TranslationProviderAdapter {
    private static final MicrosoftTranslateApi adaptee = new MicrosoftTranslateApi();

    // // Dependency Injection
    // public MicrosoftTranslateApiAdapter(MicrosoftTranslateApi microsoftTranslate) {
    //     this.adaptee = microsoftTranslate;
    // }

    @Override
    public String translate(TranslationRequest request) {
        return adaptee.translate(request.getSourceText(), request.getFromLang(), request.getToLang());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return adaptee.getSupportedLanguages();
    }
    
}
