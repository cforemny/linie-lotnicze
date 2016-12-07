package com.company.Analayzers;

import com.company.Entity.Booking;
import com.company.Entity.Passanger;
import com.company.Entity.Flight;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-07.
 */
public class AnalizerByName {

public void analizeByName(List<Booking> bookingList)
        {
        System.out.println("Zaczynamy przechodzic przez nasza liste Bookingow");
        int i=1;
        for (Booking booking : bookingList) {
            System.out.println("Wyswietle imie i nazwisko każdego pasażera bookingList:");
            for (Flight flight : booking.getFlightList()) {
                System.out.println("Przeszukuje liste " + i + " lotu.");
                i++;
                for(Passanger passanger : flight.getPassangerList())
                {
                    System.out.println(passanger.getName() + " " + passanger.getSureName());

                }
            }


        }

        }
}