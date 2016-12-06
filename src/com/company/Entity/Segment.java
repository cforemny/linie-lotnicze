package com.company.Entity;

/**
 * Created by Cyprian on 2016-12-03.
 */
public class Segment {

    private String departureCity;
    private String arrivalCity;
    private Enum<ArrivalDay> arrivalDay;
    private String arrivalTime;

    public Segment(String departureCity, String arrivalCity, Enum<ArrivalDay> arrivalDay, String arrivalTime) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.arrivalDay = arrivalDay;
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public Enum<ArrivalDay> getArrivalDay() {return arrivalDay;}

    public String getArrivalTime() {
        return arrivalTime;
    }
}
