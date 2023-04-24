package lesson20230419.base;

import java.util.List;

public class LanguageApp {
    public static void main(String[] args) {
        LanguageDAO languageDAO = new LanguageDAO();
        List<CountryLanguage> languageList = languageDAO.getAll();
        languageList.forEach(System.out::println);
    }
}
