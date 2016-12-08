package com.company;

import com.company.Analayzers.AnalizerByAge;
import com.company.Analayzers.AnalizerByName;
import com.company.Analayzers.MojAnalizer;
import com.company.BookingCreator.BookingForExOne;
import com.company.Entity.Booking;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        MojAnalizer mojAnalizer = new MojAnalizer();
        AnalizerByName analizerByName = new AnalizerByName();
        AnalizerByAge analizerByAge = new AnalizerByAge();


        List<Booking> bookings = new BookingForExOne().createBookings(); //tworze liste obiektow typu Bookings

        //mojAnalizer.analize(bookings);
        //analizerByName.analizeByName(bookings);
        analizerByAge.analizeByAge(bookings);

    }
}
