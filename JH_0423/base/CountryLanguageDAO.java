package lesson20230419.base;

import java.util.List;

public interface CountryLanguageDAO<T> {

    List getAll();

    List<CountryLanguage> get(String countryCode);

    void save(T t);

    void delete(String language);
}
