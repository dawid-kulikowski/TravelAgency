package application.model;

import java.math.BigInteger;
import java.time.LocalDate;

public class Tour {

    BigInteger tourNumber;
    TourDestination tourDestination;
    TourGuide tourGuide;
    LocalDate arrivalDate;
    LocalDate departureDate;
    Double estimatedTourPrice;
    boolean availability;

    public Tour(BigInteger tourNumber, TourDestination tourDestination, TourGuide tourGuide, LocalDate arrivalDate, LocalDate departureDate, Double estimatedTourPrice, boolean availability) {
        this.tourNumber = tourNumber;
        this.tourDestination = tourDestination;
        this.tourGuide = tourGuide;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.estimatedTourPrice = estimatedTourPrice;
        this.availability = availability;
    }
}
