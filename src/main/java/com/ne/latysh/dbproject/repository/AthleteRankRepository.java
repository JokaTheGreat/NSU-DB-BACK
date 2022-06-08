package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.AthleteRank;
import org.springframework.data.repository.CrudRepository;

public interface AthleteRankRepository extends CrudRepository<AthleteRank, Long> {
    public AthleteRank findByValue(String value);
}
