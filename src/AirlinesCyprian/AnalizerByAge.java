package AirlinesCyprian;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-09.
 */
public class AnalizerByAge {
    
    public void AnalizeByAge(List<Booking> bookingList) {

        for (Booking booking : bookingList) {
            for(Passanger passanger : booking.getPassanger()){
                System.out.println(passanger.getName() + " " + passanger.getLastName() + " " + passanger.getAge() + " " + passanger.getPassangerTypes() + " " );
            }

        }
    }







            

    }

