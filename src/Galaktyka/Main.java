package Galaktyka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-12.
 */
public class Main {
    public static void main(String[] args) {

    //  FactorList factorList = new FactorList();
    //  List<Factor> factorList1 = factorList.createFactorList();
    //  PlanetList planetList = new PlanetList();
    //  List<Planet> planetList1 = planetList.createPlanetList();

    //  Orb sun = new Sun();
    //  Orb moon = new Moon();

    //  List<Orb> orb = new ArrayList<>();
    //  orb.add(sun);
    //  orb.add(moon);

       OrbList orbList = new OrbList();
       List<Orb> orbList1 = orbList.createOrbList();

        for (Orb orb : orbList1) {

            if(orb instanceof PlanetList){
                System.out.println("Szukam Ziemi na liscie planet.");

                for (Planet planet : ((PlanetList)orb).getPlanetList()) {
                    if(planet.getName() == "Ziemia"){
                        System.out.println("Przeszukalismy liste w poszukiwaniu Ziemi i sie udalo-jest tutaj");


                    }else{
                        System.out.println("To nie ta planeta.");

                    }
                    
                }
                
            }
            if(orb instanceof Sun){
                System.out.println("Na liscie ciał niebieskich znalazlem Słonce, wiec odpalam jego metode.");
                ((Sun)orb).shine();

            }

        }


















    //   for (Planet planet : planetList1) {
    //       System.out.println(planet.getName() + " kolejnosc od Slonca " + planet.getSunQueue());

    //   }
        // for (Orb currentorb : orb) {
    //     currentorb.countMass();
    //     if(currentorb instanceof Sun == true){
    //         ((Sun)currentorb).shine();
    //     }else
    //         ((Moon)currentorb).reflect();


       }




    }

