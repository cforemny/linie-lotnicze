package com.company.Entity;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class Segment {

    private String departureCity;
    private String arrivalCity;
    private String arrivalDay;
    private String arrivalTime;

    public Segment(String departureCity, String arrivalCity, String arrivalDay, String arrivalTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.arrivalDay = arrivalDay;
        this.arrivalTime = arrivalTime;
    }
}
