package base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CountryLanguage {

    private String countryCode;

    private String language;

    private String isOfficial;

    private double percentage;

}
