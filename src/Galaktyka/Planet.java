package Galaktyka;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by Cyprian on 2016-12-14.
 */
public class Planet implements Orb {
    private String name;
    private int sunQueue;

    public Planet(String name, int sunQueue) {
        this.name = name;
        this.sunQueue = sunQueue;
    }

    public int getSunQueue() {
        return sunQueue;
    }

    public String getName() {
        return name;

    }

    @Override
    public void countMass() {

    }
}
