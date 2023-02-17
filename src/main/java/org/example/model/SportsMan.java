package org.example.model;

import java.util.Date;
import java.util.UUID;


public class SportsMan extends Person{
    private String kindOfSport;
    private String qualification;

    public SportsMan(UUID id, String firstName, String secondName, Date birthDay, String gender, String kindOfSport, String qualification) {
        super(id, firstName, secondName, birthDay, gender);
        this.kindOfSport = kindOfSport;
        this.qualification = qualification;
    }
}
