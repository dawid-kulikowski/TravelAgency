package application.model;

import java.time.LocalDateTime;

public class TourDate {

    private final LocalDateTime departureDateTime;
    private final LocalDateTime arrivalDateTime;

    public TourDate(LocalDateTime departureDateTime, LocalDateTime arrivalDateTime) {
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;

        if (arrivalDateTime.equals(departureDateTime) || departureDateTime.isAfter(arrivalDateTime)) {
            throw new IllegalArgumentException();
        }
    }
}
