package Galaktyka;

import java.util.List;

/**
 * Created by Cyprian on 2016-12-12.
 */
public class Main {
    public static void main(String[] args) {

        FactorList factorList = new FactorList();
        List<Factor> factorList1 = factorList.createFactorList();

        Orb sun = new Sun();
        Orb moon = new Moon();

        //for (Factor factor : factorList1) {
        //   System.out.println(factor.getFactorType());
        //}

        sun.countMass();
        moon.countMass();


    }
}
