package com.company;

import com.company.Analayzers.MojAnalizer;
import com.company.BookingCreator.BookingForExOne;
import com.company.Entity.Booking;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        MojAnalizer mojAnalizer = new MojAnalizer();

        List<Booking> bookings = new BookingForExOne().createBookings();

        mojAnalizer.analize(bookings);


    }
}
