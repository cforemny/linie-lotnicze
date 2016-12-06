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

    public List<Booking> createBookings() {   //metoda tworzaca bookingList


        Flight firstFlight = createFirstFlight();          // zmienna referencyjna typu Flight = wartosc zwrocona prze prywatna metode createFirstFlight();
        Flight secondFlight = createSecondFlight();

        ArrayList<Flight> flightList = new ArrayList<>();  //zmienna referencyjna flighList typu Flight rezerwuje miejsce w pamieci na nowa Arrayliste

        flightList.add(firstFlight);                       // na arrayliscie na ktora wskauzje zmienna referencyjna flightList wywolujemy metode dodaj firstFlight
        flightList.add(secondFlight);

        Booking firstBooking = new Booking(12, flightList); // tworzymy zmienna referencyjna typu Booking, ktora pokazuje na obiekt zlozony z pol bookingId i utworzonej rpzed chwila flightListy

        List<Booking> bookingList = new ArrayList<>();  //kolejna zmienna referencyjna wskazujaca na arrayliste
        bookingList.add(firstBooking);                   // wywolanie metody add na utworzonej linijke wyzej zmiennej referencyjnej

        return bookingList;                             // zwrocenie wartosci bookingList
    }

    private Flight createSecondFlight() {
        Segment segment1 = new Segment("Gdansk", "Warszawa",ArrivalDay.PONIEDZIALEK,"10.30");
        Segment segment2 = new Segment("Krakow", "Gdańsk", ArrivalDay.NIEDZIELA, "15.00");
        Segment segment3 = new Segment("Katowice", "Frankfurt", ArrivalDay.CZWARTEK, "12.15");

        ArrayList<Segment> segmentlist = new ArrayList<>(); // patyk do arraylisty

        segmentlist.add(segment1);                  //dodawanie elementu do arraylisty na ktora pokazuje patyk sementlist
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
        Segment segment1 = new Segment("Krakow", "Warszawa", ArrivalDay.SOBOTA, "10.30");
        Segment segment2 = new Segment("Krakow", "Gdańsk",ArrivalDay.SOBOTA, "15.00");
        Segment segment3 = new Segment("Katowice", "Frankfurt",ArrivalDay.PONIEDZIALEK, "8.00");

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
