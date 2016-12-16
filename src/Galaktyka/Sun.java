package Galaktyka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-12.
 */
public class Sun implements Orb {

    private double radius = 85473.234;

    public double getRadius() {
        return radius;
    }

    @Override
    public void countMass() {
        System.out.println("Masa Słońca to promień razy miliard kg jeśli w składzie jest węgiel i hel");
        FactorList factorList = new FactorList();
        List<Factor> factorList1 = factorList.createFactorList();
        for (Factor factor : factorList1) {
            System.out.println(factor.getFactorType());

        }
    }
    public void shine(){
        System.out.println("Słonce pieknie swieci wlasnym swiatlem.");
    }
}
