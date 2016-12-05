package com.company.Entity;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class Booking {

    private int bookingId;
    private List<Flight> flightList;


    public Booking(int bookingId, List<Flight> flightList) {
        this.bookingId = bookingId;
        this.flightList = flightList;
    }

    public int getBookingId() {
        return bookingId;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
