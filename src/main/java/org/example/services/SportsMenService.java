package org.example.services;

import org.example.model.SportsMan;

import java.util.List;
import java.util.UUID;

public interface SportsMenService {

    List<SportsMan> getAllSportsMen();
    void addSportsMan(SportsMan sportsMan);
    void updateSportsMan(SportsMan sportsMan);
    void deleteSportsMan(SportsMan sportsMan);
    SportsMan getSportsMan(UUID id);
}
