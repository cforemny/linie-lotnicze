package com.company.Analayzers;


import com.company.Entity.Booking;
import com.company.Entity.Flight;
import com.company.Entity.Passanger;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-08.
 */
public class AnalizerByAge{
    int adult = 0;
    int child = 0;
    public void analizeByAge(List<Booking> bookingList){
        System.out.print("Oto lista pełnoletnich pasażerów lotów: \n");
        for (Booking booking : bookingList) {
            for (Flight flight : booking.getFlightList()) {
                for (Passanger passanger : flight.getPassangerList()) {
                    if (passanger.getAge()>=18){
                        System.out.print(passanger.getName() + " " + passanger.getSureName() + " wiek: " + passanger.getAge() + "\n");
                        adult++;}
                        else{
                           child++;
                        }

                    }

                }
            }
        System.out.println("Liczba pelnoletnich pasażerów to: " + adult + "\n" + "Liczba dzieci: " + child);
        }

    }

