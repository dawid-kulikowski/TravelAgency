package application.model;

import java.math.BigInteger;

public class TourGuide {

    BigInteger tourGuideNumber;
    String name;
    String surname;

    public TourGuide(BigInteger tourGuideNumber, String name, String surname) {
        this.tourGuideNumber = tourGuideNumber;
        this.name = name;
        this.surname = surname;
    }
}
