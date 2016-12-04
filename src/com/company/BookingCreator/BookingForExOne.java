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

    public List<Booking> createBookings()
    {
// bedziemy chceli stworzyc liste Bookingow. Czyli najpierw trzeba stworzyc wszystkie rzeczy ktore znajduja sie wewnatrz Bookingu:\
        // Flight -> Segment ->
        Segment segment1 = new Segment("Krakow","Warszawa", "Poniedziałek","10.30");
        Segment segment2 = new Segment("Krakow","Gdańsk","Wtorek","15.00");
        Segment segment3 = new Segment("Katowice","Frankfurt","Sroda","8.00");
        Segment segment4 = new Segment("Berlin","Monachium","Wtorek","17.00");
        Segment segment5 = new Segment("Katowice","Londyn","Czwartek","2.00");
        Segment segment6 = new Segment("Londyn","Katowice","Piątek","12.50");
        Segment segment7 = new Segment("Madryt","Tokio","Sobota","10.00");
        Segment segment8 = new Segment("Tokio.","Madryt","Sroda","19.00");
        Segment segment9 = new Segment("Rzeszów","Gdansk","Niedziela","9.00");
        Segment segment10 = new Segment("Kraków","Gdańsk","Czwartek","15.00");

        ArrayList<Object> segmentlist = new ArrayList<>();

        segmentlist.add(segment1);
        segmentlist.add(segment2);
        segmentlist.add(segment3);
        segmentlist.add(segment4);
        segmentlist.add(segment5);
        segmentlist.add(segment6);
        segmentlist.add(segment7);
        segmentlist.add(segment8);
        segmentlist.add(segment9);
        segmentlist.add(segment10);

        Passanger passanger1 = new Passanger("Adam","Kowalski",25,PassangerType.ADULT);
        Passanger passanger2 = new Passanger("Monika","Długosz",30,PassangerType.ADULT);
        Passanger passanger3 = new Passanger("Adam","Mickiewicz",7,PassangerType.CHILD);
        Passanger passanger4 = new Passanger("Bartek","Sienkiewicz",4,PassangerType.CHILD);
        Passanger passanger5 = new Passanger("Dominik","Nowak",30,PassangerType.ADULT);
        Passanger passanger6 = new Passanger("Katarzyna","Sowa",1,PassangerType.INFANT);
        Passanger passanger7 = new Passanger("Maciej","Kiełbasa",11,PassangerType.CHILD);
        Passanger passanger8 = new Passanger("Ola","Nowak",54,PassangerType.ADULT);
        Passanger passanger9 = new Passanger("Ania","Nowak",37,PassangerType.ADULT);
        Passanger passanger10 = new Passanger("Oktawia","Chajzer",1,PassangerType.INFANT);


        ArrayList<Object> passangerlist = new ArrayList<>();

        passangerlist.add(passanger1);
        passangerlist.add(passanger2);
        passangerlist.add(passanger3);
        passangerlist.add(passanger4);
        passangerlist.add(passanger5);
        passangerlist.add(passanger6);
        passangerlist.add(passanger7);
        passangerlist.add(passanger8);
        passangerlist.add(passanger9);
        passangerlist.add(passanger10);



return null;
    }
}
