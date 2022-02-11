package org.launchcode.techjobs.oo;


import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    @Override
    public String toString() {

        String dataNF = "Data not found";

        if (name.equals("")) {
            name = dataNF;
        }

        if (employer.getValue().equals("")) {
            employer.setValue(dataNF);
        }

        if (location.getValue().equals("")) {
            location.setValue(dataNF);
        }

        if (positionType.getValue().equals("")) {
            positionType.setValue(dataNF);
        }

        if (coreCompetency.getValue().equals("")) {
            coreCompetency.setValue(dataNF);
        }

        if (name.equals(dataNF) &
                employer.getValue().equals(dataNF) &
                location.getValue().equals(dataNF) &
                positionType.getValue().equals(dataNF) &
                coreCompetency.getValue().equals(dataNF)) {
            return "OOPS! This job does not exist";
        } else {


            return "\n" + "Job " +
                    "ID: " + id +
                    "\n name: " + name +
                    "\n employer: " + employer +
                    "\n location: " + location +
                    "\n positionType: " + positionType +
                    "\n coreCompetency: " + coreCompetency +
                    "\n";
        }
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        if(job.id == ((Job) o).id) return true;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
