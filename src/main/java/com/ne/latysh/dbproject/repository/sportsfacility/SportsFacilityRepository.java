package com.ne.latysh.dbproject.repository.sportsfacility;

import com.ne.latysh.dbproject.models.sportsfacility.SportsFacility;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface SportsFacilityRepository extends CrudRepository<SportsFacility, Long> {
    @Query(name = "getSportsFacilityByCompetitionPeriod", nativeQuery = true)
    public Iterable<?> getSportsFacilityByCompetitionPeriod(Date startDate, Date endDate);
}
