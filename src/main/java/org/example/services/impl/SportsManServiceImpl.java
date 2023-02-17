package org.example.services.impl;

import org.example.model.SportsMan;
import org.example.repository.SportsManRepository;
import org.example.repository.impl.SportsManRepositoryImpl;
import org.example.services.SportsMenService;

import java.util.List;
import java.util.UUID;

public class SportsManServiceImpl implements SportsMenService {
    SportsManRepository sportsManRepository = new SportsManRepositoryImpl();

    @Override
    public List<SportsMan> getAllSportsMen() {
        return sportsManRepository.getAllStudentsFromRepository();
    }

    @Override
    public void addSportsMan(SportsMan sportsMan) {

    }

    @Override
    public void updateSportsMan(SportsMan sportsMan) {

    }

    @Override
    public void deleteSportsMan(SportsMan sportsMan) {

    }

    @Override
    public SportsMan getSportsMan(UUID id) {
        return null;
    }
}
