package Galaktyka;

/**
 * Created by Cyprian on 2016-12-12.
 */
public class Moon implements Orb {

    private double atmosphereDensinity = 947556.37465;

    public double getAtmosphereDensinity() {
        return atmosphereDensinity;
    }

    @Override
    public void countMass() {
        System.out.println("Masa księzyca to gestosc atmosfery razy 100, zakładając, że jednym z pierwiastków składowych jest chrom ");
    }
    public void reflect(){
        System.out.println("Biedny Księzyć odbija swiatło Słońca.");
    }
}
