package Galaktyka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-12.
 */
public class FactorList {

    private List<Factor> factorList = new ArrayList<>();


    public List<Factor> createFactorList(){


        Factor factor = new Factor("oxygen");
        Factor factor1 = new Factor("hydrogen");
        Factor factor2 = new Factor("helium");
        Factor factor3 = new Factor("carbon");
        Factor factor4 = new Factor("neon");
        Factor factor5 = new Factor("chrome");
        Factor factor6 = new Factor("nitrogen");
        Factor factor7 = new Factor("sulfur");
        Factor factor8 = new Factor("silicon");


        factorList.add(factor);
        factorList.add(factor1);
        factorList.add(factor2);
        factorList.add(factor3);
        factorList.add(factor4);
        factorList.add(factor5);
        factorList.add(factor6);
        factorList.add(factor7);
        factorList.add(factor8);

        return this.factorList;

    }
}
