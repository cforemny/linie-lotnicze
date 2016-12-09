package AirlinesCyprian;

import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-09.
 */
public class Passanger {
    private List<Segment> segmentList;
    private String name;
    private String lastName;
    private int age;
    private Enum<PassangerTypes> passangerTypes;

    public Passanger(List<Segment> segmentList, String name, String lastName, int age, Enum<PassangerTypes> passangerTypes) {
        this.segmentList = segmentList;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.passangerTypes = passangerTypes;
    }




    public List<Segment> getSegmentList() {
        return segmentList;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Enum<PassangerTypes> getPassangerTypes() { return passangerTypes; }
}
