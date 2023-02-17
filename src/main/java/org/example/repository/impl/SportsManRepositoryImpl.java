package org.example.repository.impl;

import org.example.model.SportsMan;
import org.example.repository.SportsManRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class SportsManRepositoryImpl implements SportsManRepository {
    List<SportsMan> sportsManList = List.of(new SportsMan(UUID.randomUUID(), "Pavel", "Slepakov", new Date("1988-09-29"), "male", "footbol", "MasterofSport"),
                                            new SportsMan(UUID.randomUUID(), "Saha", "Petrov", new Date("1994-12-29"), "male", "hockey", "MasterofSport"),
                                            new SportsMan(UUID.randomUUID(), "Stive", "Devison", new Date("1985-09-29"), "male", "footbol", "MasterofSport"),
                                            new SportsMan(UUID.randomUUID(), "Pitr", "Abdon", new Date("1991-04-229"), "male", "hockey", "MasterofSport"));

    @Override
    public List<SportsMan> getAllStudentsFromRepository() {
//        sportsManList.add(new SportsMan(UUID.randomUUID(), "Pavel", "Slepakov", new Date("1988-09-29"), "male", "footbol", "MasterofSport"));
//        sportsManList.add(new SportsMan(UUID.randomUUID(), "Saha", "Petrov", new Date("1994-12-29"), "male", "hockey", "MasterofSport"));
//        sportsManList.add(new SportsMan(UUID.randomUUID(), "Stive", "Devison", new Date("1985-09-29"), "male", "footbol", "MasterofSport"));
//        sportsManList.add(new SportsMan(UUID.randomUUID(), "Pitr", "Abdon", new Date("1991-04-229"), "male", "hockey", "MasterofSport"));
        return sportsManList;
    }
}
