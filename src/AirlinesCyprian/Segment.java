package AirlinesCyprian;

/**
 * Created by Cyprian on 2016-12-09.
 */
public class Segment {
    private String departureCity;
    private String arrivalCity;
    private Enum<ArrivalDay> arrivalDay;
    private String arrivalTime;
    private Price price;

    public Segment(String departureCity, String arrivalCity, Enum<ArrivalDay> arrivalDay, String arrivalTime, Price price) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.arrivalDay = arrivalDay;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public Enum<ArrivalDay> getArrivalDay() {
        return arrivalDay;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Price getPrice() {
        return price;
    }
}
