package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.Athlete;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface AthleteRepository extends CrudRepository<Athlete, Long> {
    @Query(name = "getAthletesByRanking", nativeQuery = true)
    public Iterable<Athlete> getAthletesByRanking(String sport, Long athleteRankId);
    @Query(name = "getAthletesByTrainerAndRank", nativeQuery = true)
    public Iterable<Athlete> getAthletesByTrainerAndRank(Long trainerLicenseId, Long athleteRankId);
    @Query(name = "getAthletesWhoMoreThanOneSport", nativeQuery = true)
    public Iterable<?> getAthletesWhoMoreThanOneSport();
    @Query(name = "getAthletesWhoWinnerByCompetition", nativeQuery = true)
    public Iterable<Athlete> getAthletesWhoWinnerByCompetition(Long competitionId);
    @Query(name = "getAthletesWhoNotInCompetitionByPeriod", nativeQuery = true)
    public Iterable<Athlete> getAthletesWhoNotInCompetitionByPeriod(Date startDate, Date endDate);
}
