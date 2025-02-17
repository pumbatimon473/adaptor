package com.assignment.question;

import java.util.List;

import com.assignment.question.external.GoogleTranslateApi;
import com.assignment.question.external.GoogleTranslationRequest;

public class GoogleTranslateApiAdapter implements TranslationProviderAdapter {
    private static final GoogleTranslateApi adaptee = new GoogleTranslateApi();
    
    // // Dependency Injection
    // public GoogleTranslateApiAdapter(GoogleTranslateApi googleTranslate) {
    //     this.adaptee = googleTranslate;
    // }

    @Override
    public String translate(TranslationRequest request) {
        return adaptee.convert(
            new GoogleTranslationRequest(
                request.getSourceText(),
                request.getFromLang(),
                request.getToLang(),
                request.getAccuracyFactor()
            )
        );
    }

    @Override
    public List<String> getSupportedLanguages() {
        return adaptee.getLanguages();
    }
    
}
