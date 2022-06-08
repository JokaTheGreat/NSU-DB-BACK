package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.SportClub;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface SportClubRepository extends CrudRepository<SportClub, Long> {
    @Query(name = "getSportClubsAndCountAthletes", nativeQuery = true)
    public Iterable<?> getSportClubsAndCountAthletes(Date startDate, Date endDate);
}
