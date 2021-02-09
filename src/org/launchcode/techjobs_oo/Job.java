package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private static final String DEFAULT_MESSAGE = "Data Not Available";

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String retval = "\n";
        retval += "ID: " + this.id + "\n";

        if (this.name.equals("")) {
            retval += "Name: " + DEFAULT_MESSAGE + "\n";
        } else {
            retval += "Name: " + this.name + "\n";
        }

        if (this.employer.toString().equals("")) {
            retval += "Employer: " + DEFAULT_MESSAGE + "\n";
        } else {
            retval += "Employer: " + this.employer + "\n";
        }

        if (this.location.toString().equals("")) {
            retval += "Location: " + DEFAULT_MESSAGE + "\n";
        } else {
            retval += "Location: " + this.location + "\n";
        }

        if (this.positionType.toString().equals("")) {
            retval += "Position Type: " + DEFAULT_MESSAGE + "\n";
        } else {
            retval += "Position Type: " + this.positionType + "\n";
        }

        if (this.coreCompetency.toString().equals("")) {
            retval += "Core Competency: " + DEFAULT_MESSAGE + "\n";
        } else {
            retval += "Core Competency: " + this.coreCompetency + "\n";
        }

        if (this.name.equals("") && this.employer.toString().equals("") && this.location.toString().equals("") && this.positionType.toString().equals("") && this.coreCompetency.toString().equals("")) {
            retval = "OOPS! This job does not seem to exist.";
        }
        return retval;
    }

// Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }


}
