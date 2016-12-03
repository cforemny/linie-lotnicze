package com.company.Entity;


import java.util.List;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class Flight {

    private List<Segment> segmentList;
    private List<Passanger> passangerList;

    private int flightNumber;

    public Flight(List<Segment> segmentList, List<Passanger> passangerList, int flightNumber) {
        this.segmentList = segmentList;
        this.passangerList = passangerList;
        this.flightNumber = flightNumber;
    }
}
