package application.model;

import java.math.BigInteger;

public class TourBooking {

    BigInteger tourBookingNumber;
    Client client;
    int numberOfPassengers;
    Double estimatedTourPrice;
    Double finalTourPrice;

    public TourBooking(BigInteger tourBookingNumber, Client client, int numberOfPassengers, Double estimatedTourPrice, Double finalTourPrice) {
        this.tourBookingNumber = tourBookingNumber;
        this.client = client;
        this.numberOfPassengers = numberOfPassengers;
        this.estimatedTourPrice = estimatedTourPrice;
        this.finalTourPrice = finalTourPrice;
    }
}
