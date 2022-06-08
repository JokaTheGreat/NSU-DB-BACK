package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.AthleteRanking;
import com.ne.latysh.dbproject.models.compositeKeys.AthleteRankingKey;
import org.springframework.data.repository.CrudRepository;

public interface AthleteRankingRepository extends CrudRepository<AthleteRanking, AthleteRankingKey> {
}
