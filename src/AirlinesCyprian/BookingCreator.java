package AirlinesCyprian;

import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-09.
 */
public class BookingCreator {


    List<Segment> segmentList = createSegment();
    List<Passanger> passangerList = createPassangers();

    public List<Booking> createBooking(){

        Booking firstBooking = new Booking(passangerList,220);
        List<Booking> bookinList = new ArrayList<>();

        bookinList.add(firstBooking);


        return bookinList;
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

        Passanger passanger1 = new Passanger(segmentList ,"Michal", "Kowalski", 30,PassangerTypes.ADULT);
        Passanger passanger2= new Passanger(segmentList ,"Michal", "Kowalski", 26,PassangerTypes.ADULT);
        Passanger passanger3 = new Passanger(segmentList ,"Michal", "Kowalski", 19,PassangerTypes.ADULT);
        Passanger passanger4 = new Passanger(segmentList ,"Michal", "Kowalski", 17,PassangerTypes.CHILD);
        Passanger passanger5 = new Passanger(segmentList ,"Michal", "Kowalski", 16,PassangerTypes.CHILD);
        Passanger passanger6 = new Passanger(segmentList ,"Michal", "Kowalski", 12,PassangerTypes.CHILD);
        Passanger passanger7 = new Passanger(segmentList ,"Michal", "Kowalski", 1,PassangerTypes.INFANT);
        Passanger passanger8 = new Passanger(segmentList ,"Michal", "Kowalski", 2,PassangerTypes.INFANT);
        Passanger passanger9 = new Passanger(segmentList ,"Michal", "Kowalski", 56,PassangerTypes.ADULT);

        List<Passanger> passangerList = new ArrayList<>();
        passangerList.add(passanger1);
        passangerList.add(passanger2);
        passangerList.add(passanger3);
        passangerList.add(passanger4);
        passangerList.add(passanger5);
        passangerList.add(passanger6);
        passangerList.add(passanger7);
        passangerList.add(passanger8);
        passangerList.add(passanger9);

        return passangerList;
    }


    public List<Segment> getSegmentList() {
        return segmentList;
    }

    public List<Passanger> getPassangerList() {
        return passangerList;
    }
}
