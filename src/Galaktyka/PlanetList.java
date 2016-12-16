package Galaktyka;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-14.
 */
public class PlanetList implements Orb {
    private List<Planet> planetList = new ArrayList<>();


    public List<Planet> getPlanetList() {
        return planetList;
    }

    public List<Planet> createPlanetList(){
        Planet planet1 = new Planet("Merkury",1);
        Planet planet2 = new Planet("Wenus",2);
        Planet planet3 = new Planet("Ziemia",3);
        Planet planet4 = new Planet("Mars",4);
        Planet planet5 = new Planet("Jowisz",5);
        Planet planet6 = new Planet("Saturn",6);
        Planet planet7 = new Planet("Uran",7);
        Planet planet8 = new Planet("Neptun",8);

        planetList.add(planet1);
        planetList.add(planet2);
        planetList.add(planet3);
        planetList.add(planet4);
        planetList.add(planet5);
        planetList.add(planet6);
        planetList.add(planet7);
        planetList.add(planet8);

        return planetList;


    }

    @Override
    public void countMass() {

    }
}
