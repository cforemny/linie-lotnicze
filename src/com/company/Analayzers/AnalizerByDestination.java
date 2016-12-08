package com.company.Analayzers;

import com.company.Entity.Booking;
import com.company.Entity.Flight;
import com.company.Entity.Segment;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-08.
 */
public class AnalizerByDestination {
    public void analizeByDestination(List<Booking> bookingList){

        for (Booking booking : bookingList) {
            for (Flight flight : booking.getFlightList()) {
                for (Segment segment : flight.getSegmentList()) {
                    if(segment.getArrivalCity() == "Warszawa"){
                        System.out.println(segment.getDepartureCity() + " " + segment.getArrivalCity() + " " + segment.getArrivalDay() + " " +segment.getArrivalTime() + " \n");

                    }
                    
                }


            }

        }
    }
}
