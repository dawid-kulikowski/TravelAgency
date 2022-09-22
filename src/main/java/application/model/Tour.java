package application.model;

import java.math.BigInteger;
import java.time.LocalDate;

public class Tour {

    private static final int MIN_DISCOUNT_PERCENTAGE = 0;
    private static final int MAX_DISCOUNT_PERCENTAGE = 5;

    BigInteger tourNumber;
    TourDestination tourDestination;
    TourGuide tourGuide;
    TourDate tourDate;
    Double estimatedTourPrice;
    boolean availability;

    public Tour(BigInteger tourNumber, TourDestination tourDestination, TourGuide tourGuide, TourDate tourDate, Double estimatedTourPrice, boolean availability) {
        this.tourNumber = tourNumber;
        this.tourDestination = tourDestination;
        this.tourGuide = tourGuide;
        this.tourDate = tourDate;
        this.estimatedTourPrice = estimatedTourPrice;
        this.availability = availability;
    }


}
