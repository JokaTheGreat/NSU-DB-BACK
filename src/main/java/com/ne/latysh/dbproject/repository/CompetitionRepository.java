package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
    @Query(name = "getCompetitionByPeriod", nativeQuery = true)
    public List<Competition> getCompetitionByPeriod(Date startDate, Date endDate);
    @Query(name = "getCompetitionByFacility", nativeQuery = true)
    public List<Competition> getCompetitionByFacility(Long sportsFacilityId);
}
