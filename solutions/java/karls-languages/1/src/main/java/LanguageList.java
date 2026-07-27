import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
       return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
    String lang = languages.get(0);
        return lang;
    }

    public int count() {

    int count = languages.size();
        return count;
        
        }

    public boolean containsLanguage(String language) {
        boolean hasLang = languages.contains(language);
        return hasLang;
    }

    public boolean isExciting() {
         boolean hasLang = languages.contains("Java") ||languages.contains("Kotlin");
        return hasLang;
        
    }
}
