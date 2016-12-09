package AirlinesCyprian;

import com.company.Entity.PassangerType;

import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by Cyprian on 2016-12-09.
 */
public class Passanger {
    private List<Segment> segment;
    private String name;
    private String lastName;
    private int age;
    private Enum<PassangerType> passangerType;

    public Passanger(List<Segment> segment, String name, String lastName, int age, Enum<PassangerType> passangerType) {
        this.segment = segment;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.passangerType = passangerType;
    }



    public List<Segment> getSegment() {
        return segment;
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

    public Enum<PassangerType> getPassangerType() {
        return passangerType;
    }
}
