package base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class City {

    private int id;

    private String name;

    private String countryCode;

    private String district;

    private int population;

}
