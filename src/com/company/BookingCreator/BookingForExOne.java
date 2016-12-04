package com.company.BookingCreator;

import com.company.Entity.*;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import static com.company.Entity.PassangerType.ADULT;
import static com.company.Entity.PassangerType.CHILD;
import static com.company.Entity.PassangerType.INFANT;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class BookingForExOne {

    public List<Booking> createBookings() {
// bedziemy chceli stworzyc liste Bookingow. Czyli najpierw trzeba stworzyc wszystkie rzeczy ktore znajduja sie wewnatrz Bookingu:\
        // Flight -> Segment ->

        Flight firstFlight = createFirstFlight();
        Flight secondFlight = createSecondFlight();

        ArrayList<Flight> flightList = new ArrayList<>();

        flightList.add(firstFlight);
        flightList.add(secondFlight);

        Booking firstBooking = new Booking(12, flightList);

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(firstBooking);

        return bookingList;
    }

    private Flight createSecondFlight() {
        Segment segment1 = new Segment("Gdansk", "Warszawa", "Wtorek", "10.30");
        Segment segment2 = new Segment("Krakow", "Gdańsk", "DUUPAAAAA - zamiast dnia tygodnia", "15.00");
        Segment segment3 = new Segment("Katowice", "Frankfurt", "Sroda", "Tez wielkaa duupa zamiast czasu");

        ArrayList<Segment> segmentlist = new ArrayList<>();

        segmentlist.add(segment1);
        segmentlist.add(segment2);
        segmentlist.add(segment3);

        Passanger passanger1 = new Passanger("Michal", "Kowalski", 30, PassangerType.ADULT);
        Passanger passanger2 = new Passanger("Monika", "Długosz", 30, PassangerType.ADULT);
        Passanger passanger3 = new Passanger("Adam", "Mickiewicz", 7, PassangerType.CHILD);
        Passanger passanger4 = new Passanger("Bartek", "Sienkiewicz", 4, PassangerType.INFANT);

        ArrayList<Passanger> passangerlist = new ArrayList<>();

        passangerlist.add(passanger1);
        passangerlist.add(passanger2);
        passangerlist.add(passanger3);
        passangerlist.add(passanger4);

        return new Flight(segmentlist, passangerlist, 2255);

    }

    private Flight createFirstFlight() {
        Segment segment1 = new Segment("Krakow", "Warszawa", "Poniedziałek", "10.30");
        Segment segment2 = new Segment("Krakow", "Gdańsk", "Wtorek", "15.00");
        Segment segment3 = new Segment("Katowice", "Frankfurt", "Sroda", "8.00");

        ArrayList<Segment> segmentlist = new ArrayList<>();

        segmentlist.add(segment1);
        segmentlist.add(segment2);
        segmentlist.add(segment3);

        Passanger passanger1 = new Passanger("Adam", "Kowalski", 25, PassangerType.ADULT);
        Passanger passanger2 = new Passanger("Monika", "Długosz", 30, PassangerType.ADULT);
        Passanger passanger3 = new Passanger("Adam", "Mickiewicz", 7, PassangerType.CHILD);
        Passanger passanger4 = new Passanger("Bartek", "Sienkiewicz", 4, PassangerType.INFANT);

        ArrayList<Passanger> passangerlist = new ArrayList<>();

        passangerlist.add(passanger1);
        passangerlist.add(passanger2);
        passangerlist.add(passanger3);
        passangerlist.add(passanger4);

        return new Flight(segmentlist, passangerlist, 1455);
    }
}
