package com.ne.latysh.dbproject.repository;

import com.ne.latysh.dbproject.models.CompetitionPlayer;
import com.ne.latysh.dbproject.models.compositeKeys.CompetitionPlayerKey;
import org.springframework.data.repository.CrudRepository;

public interface CompetitionPlayerRepository extends CrudRepository<CompetitionPlayer, CompetitionPlayerKey> {
}
