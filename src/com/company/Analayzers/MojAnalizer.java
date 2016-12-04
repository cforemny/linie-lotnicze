package com.company.Analayzers;

import com.company.Entity.Booking;
import com.company.Entity.Flight;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class MojAnalizer {

    public void analize(List<Booking> bookingList)
    {
        System.out.println("Zaczynamy przechodzic przez nasza liste Bookingow");

        for (Booking booking : bookingList) {

            System.out.println("Wyswietle wszystkie numery lotu w tym bookingu:");
            for (Flight flight : booking.getFlightList()) {
                System.out.println(flight.getFlightNumber());
            }
        }

    }

    public void bla()
    {

    }
}
