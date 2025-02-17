import com.assignment.question.GoogleTranslateApiAdapter;
import com.assignment.question.MicrosoftTranslateApiAdapter;
import com.assignment.question.TranslationProviderAdapter;
import com.assignment.question.TranslationRequest;
import com.assignment.question.external.GoogleTranslateApi;
import com.assignment.question.external.GoogleTranslationRequest;
import com.assignment.question.external.MicrosoftTranslateApi;

public class TranslationManager {

    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();
    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {
        TranslationProviderAdapter translationProvider;
        TranslationRequest translationRequest;
        
        if (provider.equals("google")) {
            // GoogleTranslationRequest request = new GoogleTranslationRequest(text, sourceLanguage, targetLanguage, 0.8);
            // return googleTranslateApi.convert(request);
            translationProvider = new GoogleTranslateApiAdapter();
            translationRequest = new TranslationRequest(text, sourceLanguage, targetLanguage, 0.8);
        } else if (provider.equals("microsoft")) {
            // return microsoftTranslateApi.translate(text, sourceLanguage, targetLanguage);
            translationProvider = new MicrosoftTranslateApiAdapter();
            translationRequest = new TranslationRequest(text, sourceLanguage, targetLanguage);
        }
        else {
            throw new RuntimeException("Invalid provider");
        }

        return translationProvider.translate(translationRequest);
    }

}