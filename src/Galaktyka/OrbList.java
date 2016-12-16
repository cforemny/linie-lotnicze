package Galaktyka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-14.
 */
public class OrbList implements  Orb {
    List<Orb> orbList = new ArrayList<>();

    public List<Orb> createOrbList (){
        FactorList factorList = new FactorList();
        List<Factor> factorList1 = factorList.createFactorList();
        PlanetList planetList = new PlanetList();
        List<Planet> planetList1 = planetList.createPlanetList();
        Orb sun = new Sun();
        Orb moon = new Moon();

        orbList.add(planetList);
        orbList.add(factorList);
        orbList.add(sun);
        orbList.add(moon);

        return orbList;

    }

    @Override
    public void countMass() {

    }
}
