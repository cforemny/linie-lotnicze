package com.company.BookingCreator;

import com.company.Entity.Booking;
import com.company.Entity.Flight;
import com.company.Entity.Passanger;
import com.company.Entity.Segment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class BookingForExOne {

    public List<Booking> createBookings()
    {
// bedziemy chceli stworzyc liste Bookingow. Czyli najpierw trzeba stworzyc wszystkie rzeczy ktore znajduja sie wewnatrz Bookingu:\
        // Flight -> Segment ->
        Segment segment1 = new Segment();
        Segment segment2 = new Segment();

        ArrayList<Object> segmentlist = new ArrayList<>();

        segmentlist.add(segment1);
        segmentlist.add(segment2);

        Passanger passanger1 = new Passanger();
        Passanger passanger2 = new Passanger();

        ArrayList<Object> passangerlist = new ArrayList<>();

        passangerlist.add(passanger1);
        passangerlist.add(passanger2);


return null;
    }
}
