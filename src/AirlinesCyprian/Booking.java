package AirlinesCyprian;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-09.
 */
public class Booking implements Seller {
    private List<Passanger> passanger;
    private int bookingId;

    public Booking(List<Passanger> passanger, int bookingId) {
        this.passanger = passanger;
        this.bookingId = bookingId;
    }

    public List<Passanger> getPassanger() {
        return passanger;
    }

    @Override
    public void seller() {


    }
}
