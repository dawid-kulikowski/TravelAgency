package application.model;

import application.model.utils.ValueValidator;

import java.util.regex.Pattern;

public class TourDestination {
    private static final Pattern PLACE_NAMING_PATTERN = Pattern.compile("^[A-Z][a-z]+$");
    private final String country;
    private final String city;

    public TourDestination(String country, String city) {
        this.country = ValueValidator.requiredNotNull(country);
        this.city = ValueValidator.requiredNotNull(city);

        if (!PLACE_NAMING_PATTERN.matcher(country).matches()) {
            throw new IllegalArgumentException();
        }

        if (!PLACE_NAMING_PATTERN.matcher(city).matches()) {
            throw new IllegalArgumentException();
        }
    }
}
