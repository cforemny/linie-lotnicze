package AirlinesCyprian;

import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-09.
 */
public class BookingCreator {

    public List<Booking> createBooking(){

        List<Booking> bookingList = new ArrayList<>();

        return bookingList;
    }

    public List<Segment> createSegment(){
        Price price = new Price(300);
        Segment segment1 = new Segment("Krakow", "Warszawa", ArrivalDay.SOBOTA, "10.30",price);
        Segment segment2 = new Segment("Krakow", "Gdańsk",ArrivalDay.SOBOTA, "15.00",price);
        Segment segment3 = new Segment("Katowice", "Frankfurt",ArrivalDay.PONIEDZIALEK, "8.00", price);
        Segment segment4 = new Segment("Krakow", "Warszawa", ArrivalDay.SOBOTA, "10.30",price);
        Segment segment5 = new Segment("Krakow", "Gdańsk",ArrivalDay.SOBOTA, "15.00",price);
        Segment segment6 = new Segment("Katowice", "Frankfurt",ArrivalDay.PONIEDZIALEK, "8.00",price);

        List<Segment> segmentList = new ArrayList<>();

        segmentList.add(segment1);
        segmentList.add(segment2);
        segmentList.add(segment3);
        segmentList.add(segment4);
        segmentList.add(segment5);
        segmentList.add(segment6);

        return segmentList;

    }

    public List<Passanger> createPassangers(){

        Passanger passanger1 = new Passanger(createSegment(),"Michal", "Kowalski", 30);
       // Passanger passanger2 = new Passanger(,"Monika", "Długosz", 74, PassangerType.ADULT);
       // Passanger passanger3 = new Passanger(,"Adam", "Mickiewicz", 7, PassangerType.CHILD);
       // Passanger passanger4 = new Passanger(,"Bartek", "Sienkiewicz", 4, PassangerType.INFANT);
        return null;
    }




}
